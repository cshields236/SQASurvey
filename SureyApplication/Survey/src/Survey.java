import java.util.ArrayList;

public class Survey {
   
    private String name;
    private ArrayList <Question>  questions =new ArrayList <Question>(); 

    public Survey() {
        
    }
    public Survey(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }


    public void addQuestion(Question question){

            this.questions.add(question);
    }

}
