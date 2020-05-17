public class Question {
    
    private String question;
    private int answer;
    // Question Constructers
    public Question() {
    }

    public Question question(String question, int answer) {
        this.question = question;
        this.answer = answer;
        return this;
    }


    //Question getter and setter 

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getAnswer() {
        return this.answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
 

 

    
}