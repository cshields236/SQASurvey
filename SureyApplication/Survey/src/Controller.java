import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    public Survey createEmptySurvey() {
        Survey s = new Survey();
        return s;
    }

    public Survey createSurvey(String title, ArrayList<Question> surveyQuestions) {

        ArrayList<Question> questions = surveyQuestions;
        Survey s = new Survey(title, questions);
        return s;
    }

    // Take in a survey and question and add the question to the survey
    public void addQuestion(Survey s, Question q) {
        s.addQuestion(q);
    }

    // Returning specific survey
    public Survey retriveSpecificSurvey(ArrayList<Survey> surveys, String name) {

        Survey returnSurvey = new Survey();

        for (Survey s : surveys) {
            if (s.getName().equals(name)) {
                returnSurvey = s;

            }

        }
        return returnSurvey;

    }

    // Returning all surveys
    public ArrayList<Survey> retriveAllSurveys(ArrayList<Survey> surveys) {
        return surveys;
    }

    // Create new survey response
    public SurveyResponse createNewSurveyResponse(Survey survey, int response1, int response2, int response3) {
    
        // Create empty surveyResponse object 
        SurveyResponse surveyResponse = new SurveyResponse();
        // Create Hashmap to be used for survey question answers 
        HashMap<Integer, Integer> surveyAnswers = new HashMap<>();

        
        // Add the users reponses to hashmap
        surveyAnswers.put(1,response1); 
        surveyAnswers.put(2,response2); 
        surveyAnswers.put(3,response3); 
        
        // Add the map with the users reponses to the survey response object
        surveyResponse.setAnswers(surveyAnswers);
        // Add the survey response to the survey
        survey.addSurveyResponse(surveyResponse);
        // return the survey response
        return surveyResponse;

  

 
    }

}