public class Lesson {
    private String title;

    public Lesson(String title) {
        this.title = title;
    }

    public void startLesson() {
        System.out.println("Starting lesson: " + title);
    }
}
