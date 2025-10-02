package OopsLearning;

class StudentAcc {
    private String studentName;
    private int rollNo;
    private int marks;

    public StudentAcc(String studentName, int rollNo, int marks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public int getMarks() {
        return marks;
    }

    public void displayStudent() {
        System.out.println("Student Name : " + getStudentName());
        System.out.println("Roll Number : " + getRollNo());
        System.out.println("Marks : " + getMarks());
    }
}

class ScienceAcc extends StudentAcc {
    private int bonus;

    public ScienceAcc(String studentName, int rollNo, int marks, int bonus) {
        super(studentName, rollNo, marks);
        this.bonus = bonus;
    }
    public int totalMarks() {
        return getMarks() + bonus;
    }
    public void displayScienceAcc() {
        displayStudent();
        System.out.println("Bonus Marks : " + bonus);
        System.out.println("Total Marks : " + totalMarks());
    }
}

class CommerceAcc extends StudentAcc {
    private int extra;

    public CommerceAcc(String studentName, int rollNo, int marks, int extra) {
        super(studentName, rollNo, marks);
        this.extra = extra;
    }
    public void displayCommerceAcc() {
        displayStudent();
        System.out.println("Extra Activity Marks : " + extra);
    }
}

public class CustomHierarchical {
    public static void main(String[] args) {
        StudentAcc studentAcc = new StudentAcc("PRIYA", 1101, 85);
        studentAcc.displayStudent();
        System.out.println();

        ScienceAcc sciAcc = new ScienceAcc("RAHUL", 1102, 75, 10);
        sciAcc.displayScienceAcc();
        System.out.println();

        CommerceAcc comAcc = new CommerceAcc("ANITA", 1103, 70, 8);
        comAcc.displayCommerceAcc();
    }
}
