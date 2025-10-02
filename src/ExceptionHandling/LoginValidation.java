package ExceptionHandling;
import java.util.Scanner;

class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {
        super(msg);
    }
}

public class LoginValidation {
    public static void authenticate(String user, String pass) throws InvalidLoginException {
        if (user.isEmpty() || pass.isEmpty())
            throw new InvalidLoginException("Input fields cannot be blank!");

        if (!user.equals("Aashik") || !pass.equals("Aashikpass"))
            throw new InvalidLoginException("Incorrect username or password!");

        System.out.println("Hello, " + user.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Provide Username: ");
        String inputUser = inputScanner.nextLine();
        System.out.println("Provide Password: ");
        String inputPass = inputScanner.nextLine();

        try {
            authenticate(inputUser, inputPass);
        } catch (InvalidLoginException e) {
            System.out.println("Access Denied: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
