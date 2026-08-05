import java.util.Scanner;

public class Quiz {

    public void startQuiz() {

        Scanner input = new Scanner(System.in);
        int score = 0;
Progress progress = new Progress();
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
            System.out.println(questions[i].getQuestion());

for (String option : questions[i].getOptions()) {
    System.out.println(option);
}
            System.out.print("Your answer: ");
            String userAnswer = input.nextLine();

    if (userAnswer.equalsIgnoreCase(questions[i].getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
               System.out.println("Correct answer: " + questions[i].getAnswer());
System.out.println("Explanation: " + questions[i].getExplanation()); 
            }
        }

        System.out.println();
System.out.println("======================");
System.out.println("     QUIZ RESULTS");
System.out.println("======================");
System.out.println("Score: " + score + "/" + questions.length);

double percent = (score * 100.0) / questions.length;

System.out.println("Percentage: " + percent + "%");

if (percent == 100) {
    System.out.println("Excellent! Perfect score!");
} else if (percent >= 80) {
    System.out.println("Great work!");
} else if (percent >= 60) {
    System.out.println("Good job! Keep practicing.");
} else {
    System.out.println("Don't give up. Review the lesson and try again.");
}if (percent >= 60) {
    progress.passQuiz();
}

progress.showProgress();
    }
}
}