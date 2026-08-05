import java.util.Scanner;

public class User {

    static Scanner scanner = new Scanner(System.in);

    private static String username = "";
    private static String password = "";
    private static boolean loggedIn = false;

    public static void register() {
        System.out.println("\n=== Register ===");
        System.out.print("Enter username: ");
        username = scanner.nextLine();

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        System.out.println("Registration successful!");
    }

    public static void login() {
        System.out.println("\n=== Login ===");

        System.out.print("Username: ");
        String inputUser = scanner.nextLine();

        System.out.print("Password: ");
        String inputPass = scanner.nextLine();

        if (inputUser.equals(username) && inputPass.equals(password)) {
            loggedIn = true;
            System.out.println("Login successful. Welcome " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static String getUsername() {
        return username;
    }
}
