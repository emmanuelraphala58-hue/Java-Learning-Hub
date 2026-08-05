public class Progress {
    private int completedLessons = 0;

    public void completeLesson() {
        completedLessons++;
    }

    public void showProgress() {
        System.out.println("Lessons completed: " + completedLessons);
    }
}
