package Thread;

class Student extends Thread {
    String name;

    Student(String studentName) {
        name = studentName;
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(name + " studying hour " + i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(name + " study complete");
    }
}

public class StudentStudy {
    public static void main(String[] args) {
        Student s1 = new Student("Aashik");
        Student s2 = new Student("Guru");

        s1.start();
        s2.start();
    }
}

