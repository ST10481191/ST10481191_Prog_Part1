import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        Login login = new Login(firstName, lastName);

        System.out.println("\n=== REGISTRATION ===");

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cell phone number (+27...): ");
        String cell = input.nextLine();

        System.out.println(login.registerUser(username, password, cell));

        System.out.println("\n=== LOGIN ===");

        System.out.print("Enter username: ");
        String loginUser = input.nextLine();

        System.out.print("Enter password: ");
        String loginPass = input.nextLine();

        boolean success = login.loginUser(loginUser, loginPass);

        System.out.println(login.returnLoginStatus(success));

        input.close();
    }
}