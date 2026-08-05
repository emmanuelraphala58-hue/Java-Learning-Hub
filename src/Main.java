import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      JAVA LEARNING HUB");
        System.out.println("=================================");
        System.out.println("1. Start Lesson");
        System.out.println("2. Take Quiz");
        System.out.println("3. View Progress");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();

        switch (choice) {
    case 1:
        System.out.println("\nStarting Java Lessons...");
        break;

    case 2:
        System.out.println("\nStarting Java Quiz...");
        break;

    case 3:
        System.out.println("\nDisplaying Progress...");
        break;

    case 4:
        System.out.println("\nThank you for using Java Learning Hub!");
        break;

    default:
        System.out.println("\nInvalid option. Please choose 1-4.");
}

        input.close();
    }
}