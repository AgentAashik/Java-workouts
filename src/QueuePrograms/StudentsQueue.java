package QueuePrograms;

import java.util.*;

public class StudentsQueue {
    public static void main(String[] args) {
        System.out.println("Queue Example");

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Queue: " + q);

        System.out.println("Removed: " + q.poll());
        System.out.println("Front: " + q.peek());
        System.out.println("Queue now: " + q);

        while(!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();

        System.out.println("Priority Queue Example");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);

        System.out.println("Top element: " + pq.peek());

        System.out.print("In order: ");
        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        maxpq.add(40);
        maxpq.add(10);
        maxpq.add(30);
        maxpq.add(20);

        System.out.print("Max order: ");
        while(!maxpq.isEmpty()) {
            System.out.print(maxpq.poll() + " ");
        }
        System.out.println();

        PriorityQueue<String> students = new PriorityQueue<>();
        students.add("Babu");
        students.add("Guru");
        students.add("Yuvi");
        students.add("Dharun");

        System.out.print("Students: ");
        while(!students.isEmpty()) {
            System.out.print(students.poll() + " ");
        }
    }
}
