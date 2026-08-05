public class Quiz {
    private int score = 0;

    public void answerQuestion(boolean correct) {
        if (correct) {
            score++;
        }
    }

    public void showScore() {
        System.out.println("Quiz Score: " + score);
    }
}
