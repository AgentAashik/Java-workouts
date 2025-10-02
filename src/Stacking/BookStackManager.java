package Stacking;

import java.util.*;

class BookStack {
    Stack<String> books = new Stack<>();
    Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter book title: ");
        String book = sc.nextLine();
        books.push(book);
        System.out.println("Book added to stack.");
    }

    public void removeBook() {
        if (!books.isEmpty()) {
            String removedBook = books.pop();
            System.out.println("Removed: " + removedBook);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public void peekBook() {
        if (!books.isEmpty()) {
            System.out.println("Top book: " + books.peek());
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public void displayBooks() {
        if (!books.isEmpty()) {
            System.out.println("Books in stack:");
            for (String book : books) {
                System.out.println(book);
            }
        } else {
            System.out.println("Stack is empty!");
        }
    }
}

public class BookStackManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStack bookStack = new BookStack();

        System.out.println("=== BOOK STACK ===");
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Peek Book");
        System.out.println("4. Display Books");
        System.out.println("5. Exit");

        while (true) {
            System.out.print("\nChoose option (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> bookStack.addBook();
                case 2 -> bookStack.removeBook();
                case 3 -> bookStack.peekBook();
                case 4 -> bookStack.displayBooks();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}
