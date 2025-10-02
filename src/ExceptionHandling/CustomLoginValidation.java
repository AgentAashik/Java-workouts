package ExceptionHandling;

import java.util.Scanner;

class BadUsernameException extends Exception {
    public BadUsernameException(String message) {
        super(message);
    }
}

class BadPasswordException extends Exception {
    public BadPasswordException(String message) {
        super(message);
    }
}

class EmptyFieldException extends Exception {
    public EmptyFieldException(String message) {
        super(message);
    }
}

class SimpleLogin {

    public void checkUsername(String username) throws BadUsernameException, EmptyFieldException {
        if (username.equals("")) {
            throw new EmptyFieldException("Username cannot be empty!");
        }
        if (username.length() < 3) {
            throw new BadUsernameException("Username too short! Must be at least 3 letters.");
        }
        if (!username.equals("admin") && !username.equals("user") && !username.equals("guest")) {
            throw new BadUsernameException("Username not found: " + username);
        }
        System.out.println("Username OK: " + username);
    }

    public void checkPassword(String password) throws BadPasswordException, EmptyFieldException {
        if (password.equals("")) {
            throw new EmptyFieldException("Password cannot be empty!");
        }
        if (password.length() < 4) {
            throw new BadPasswordException("Password too short! Must be at least 4 characters.");
        }
        if (!password.equals("1234") && !password.equals("pass") && !password.equals("admin")) {
            throw new BadPasswordException("Wrong password: " + password);
        }
        System.out.println("Password OK");
    }
}

public class CustomLoginValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleLogin login = new SimpleLogin();

        System.out.println("=== Simple Login System ===");
        System.out.println("Valid usernames: admin, user, guest");
        System.out.println("Valid passwords: 1234, pass, admin");

        while (true) {
            try {
                System.out.println("\nEnter username: ");
                String username = sc.nextLine();
                login.checkUsername(username);

                System.out.println("Enter password: ");
                String password = sc.nextLine();
                login.checkPassword(password);

                System.out.println("Welcome " + username + "! You are logged in.");
                break;

            } catch (EmptyFieldException e) {
                System.out.println("ERROR: " + e.getMessage());
            } catch (BadUsernameException e) {
                System.out.println("USERNAME ERROR: " + e.getMessage());
            } catch (BadPasswordException e) {
                System.out.println("PASSWORD ERROR: " + e.getMessage());
            }

            System.out.println("Try again...");
        }

        sc.close();
    }
}
