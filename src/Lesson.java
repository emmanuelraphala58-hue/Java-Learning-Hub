public class Lesson {

    private String title;

    public Lesson(String title) {
        this.title = title;
    }

    public void startLesson() {

        System.out.println("=================================");
        System.out.println(title);
        System.out.println("=================================");

        System.out.println("Lesson 1: What is Java?");
        System.out.println();
        System.out.println("Java is a programming language used");
        System.out.println("to build desktop, web, and mobile");
        System.out.println("applications.");
        System.out.println();
        System.out.println("Java is:");
        System.out.println("- Object-Oriented");
        System.out.println("- Platform Independent");
        System.out.println("- Secure");
        System.out.println("- Easy to Learn");
        System.out.println();
        System.out.println("End of Lesson 1.");
    }
}