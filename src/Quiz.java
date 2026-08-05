import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        Scanner input = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "Who created Java?",
            "Which company owns Java today?",
            "What keyword is used to create an object?",
            "Which method starts every Java program?",
            "Which keyword is used to declare a class?"
        };

        String[] answers = {
            "James Gosling",
            "Oracle",
            "new",
            "main",
            "class"
        };

        for (int i = 0; i < questions.length; i++) {

            System.out.println();
            System.out.println("Question " + (i + 1));
            System.out.println(questions[i]);

            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
                System.out.println("Correct answer: " + answers[i]);
            }
        }

        System.out.println();
        System.out.println("Quiz Finished!");
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}