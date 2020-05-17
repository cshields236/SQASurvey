import java.util.ArrayList;
import java.util.HashMap;

public class Survey {
   
    private String name;
    private ArrayList <Question>  questions =new ArrayList <Question>(); 
    private ArrayList <SurveyResponse> surveyResponses = new ArrayList();

    //Empty constructor
    public Survey() {
        
    }
    // Constructor with name and questions 
    public Survey(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }
    //Constructor that takes just name 
    public Survey(String name) {
        this.name = name;
        
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



    public ArrayList<SurveyResponse> getSurveyResponses() {
        return this.surveyResponses;
    }

    public void setSurveyResponses(ArrayList<SurveyResponse> surveyResponses) {
        this.surveyResponses = surveyResponses;
    }




}
