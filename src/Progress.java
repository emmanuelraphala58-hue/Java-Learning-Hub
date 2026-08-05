
public class Progress {

    private int lessonsCompleted;
    private int quizzesPassed;

    public Progress() {
        lessonsCompleted = 0;
        quizzesPassed = 0;
    }

    public void completeLesson() {
        lessonsCompleted++;
    }

    public void passQuiz() {
        quizzesPassed++;
    }

    public void showProgress() {
        System.out.println("\n===== Progress =====");
        System.out.println("Lessons Completed: " + lessonsCompleted);
        System.out.println("Quizzes Passed: " + quizzesPassed);
        System.out.println("====================");
    }
}