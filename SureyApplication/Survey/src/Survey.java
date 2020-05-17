import java.util.ArrayList;

public class Survey {
   
    private String name;
    private ArrayList <Question>  questions =new ArrayList <Question>(); 



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

}
