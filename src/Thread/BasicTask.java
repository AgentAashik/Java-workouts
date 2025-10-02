package Thread;

class Task implements Runnable {
    String taskName;

    Task(String name) {
        taskName = name;
    }

    public void run() {
        System.out.println(taskName + " started");

        for(int i = 1; i <= 3; i++) {
            System.out.println(taskName + " step " + i);
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
                System.out.println("sleep error");
            }
        }

        System.out.println(taskName + " finished");
    }
}

public class BasicTask {
    public static void main(String[] args) {
        Task job1 = new Task("Job1");
        Task job2 = new Task("Job2");

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);

        t1.start();
        t2.start();
    }
}
