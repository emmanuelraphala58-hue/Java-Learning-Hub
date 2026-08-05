import java.util.Scanner;

public class LessonMenu {

    public void showLessons() {

        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("        JAVA LESSONS");
        System.out.println("==============================");
        System.out.println("1. What is Java?");
        System.out.println("2. Variables");
        System.out.println("3. Data Types");
        System.out.println("4. Operators");
        System.out.println("5. If Statements");
        System.out.println("6. Loops");
        System.out.println("7. Methods");
        System.out.println("8. Arrays");
        System.out.println("9. Classes & Objects");
        System.out.println("10. Object-Oriented Programming");
        System.out.println("0. Back");

        System.out.print("\nChoose a lesson: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Lesson lesson = new Lesson("Lesson 1: What is Java?");
                lesson.startLesson();
                break;
            case 2:
    Lesson2 lesson2 = new Lesson2();
    lesson2.startLesson();
    break;
            case 3:
    Lesson3 lesson3 = new Lesson3();
    lesson3.startLesson();
    break;
            case 4:
    Lesson4 lesson4 = new Lesson4();
    lesson4.startLesson();
    break;
          case 5:
    Lesson5 lesson5 = new Lesson5();
    lesson5.startLesson();
    break;
          case 6:
    Lesson6 lesson6 = new Lesson6();
    lesson6.startLesson();
    break;
       case 7:
    Lesson7 lesson7 = new Lesson7();
    lesson7.startLesson();
    break;
       case 8:
    Lesson8 lesson8 = new Lesson8();
    lesson8.startLesson();
    break;
       case 9:
    Lesson9 lesson9 = new Lesson9();
    lesson9.startLesson();
    break;
       case 10:
    Lesson10 lesson10 = new Lesson10();
    lesson10.startLesson();
    break;
       case 11:
    Lesson11 lesson11 = new Lesson11();
    lesson11.startLesson();
    break; 
        default:
    System.out.println("Invalid choice!");
    System.out.println("Please select a lesson from the menu.");
        }
    }
}