import java.util.ArrayList;

public class Controller {

    public Survey createEmptySurvey() {
        Survey s = new Survey();
        return s;
    }

    public Survey createSurvey(ArrayList<Question> surveyQuestions) {

        ArrayList<Question> questions = surveyQuestions;
        Survey s = new Survey("Questions", questions);
        return s;
    }

    // Take in a survey and question and add the question to the survey
    public void addQuestion(Survey s, Question q) {
        s.addQuestion(q);
    }

    // Returning specific survey
    public Survey retriveSpecificSurvey(ArrayList<Survey> surveys , String name){
        
        Survey returnSurvey = new Survey();

        for(Survey s: surveys){
            if (s.getName().equals(name)){
                returnSurvey = s;
                 
            }
           

    } return returnSurvey;

    }


      // Returning all surveys
      public ArrayList<Survey> retriveAllSurveys(ArrayList<Survey> surveys ){
         return surveys;
    }
}