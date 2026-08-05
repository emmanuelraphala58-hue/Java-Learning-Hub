public class Question {

    private String question;
    private String[] options;
    private String answer;
    private String explanation;

    public Question(String question, String[] options, String answer, String explanation) {
        this.question = question;
        this.options = options;
        this.answer = answer;
        this.explanation = explanation;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    public String getExplanation() {
        return explanation;
    }
}