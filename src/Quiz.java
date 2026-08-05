import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        Scanner input = new Scanner(System.in);
        int score = 0;

        Question[] questions = {

    new Question(
        "Who created Java?",
        new String[]{"A. Dennis Ritchie", "B. James Gosling", "C. Bill Gates", "D. Guido van Rossum"},
        "B",
        "James Gosling created Java at Sun Microsystems."
    ),

    new Question(
        "Which company owns Java today?",
        new String[]{"A. Microsoft", "B. IBM", "C. Oracle", "D. Google"},
        "C",
        "Oracle acquired Sun Microsystems in 2010."
    ),

    new Question(
        "Which keyword is used to create an object?",
        new String[]{"A. class", "B. new", "C. object", "D. create"},
        "B",
        "The 'new' keyword creates an object."
    ),

    new Question(
        "Which method starts every Java program?",
        new String[]{"A. start()", "B. run()", "C. main()", "D. execute()"},
        "C",
        "Every Java application starts with the main() method."
    ),

    new Question(
        "Which keyword is used to declare a class?",
        new String[]{"A. class", "B. public", "C. static", "D. void"},
        "A",
        "The 'class' keyword is used to declare a class."
    )

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