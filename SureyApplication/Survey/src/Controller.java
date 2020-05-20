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
        // loop through the collection of surveys
        for (Survey s : surveys) {
            if (s.getName().equals(name)) {
                // set the searched for survey with the survey to return
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
    public SurveyResponse createNewSurveyResponse(int response1, int response2, int response3) {

        // Create empty surveyResponse object
        SurveyResponse surveyResponse = new SurveyResponse();
        // Create Hashmap to be used for survey question answers
        HashMap<Integer, Integer> surveyAnswers = new HashMap<>();

        // Add the users reponses to hashmap
        surveyAnswers.put(1, response1);
        surveyAnswers.put(2, response2);
        surveyAnswers.put(3, response3);

        // Add the map with the users reponses to the survey response object
        surveyResponse.setAnswers(surveyAnswers);
        // Add the survey response to the survey

        // return the survey response
        return surveyResponse;

    }

    // add survey response to the survey
    public Survey addSurveyResponse(Survey survey, SurveyResponse surveyResponse) {

        survey.addSurveyResponse(surveyResponse);
        return survey;

    }

    // Get all survey responses for a survey
    public ArrayList<SurveyResponse> getAllSurveyResponses(ArrayList<Survey> surveys, String surveyName) {
        ArrayList<SurveyResponse> responses = new ArrayList<SurveyResponse>();
        // loop through the collection of surveys
        for (Survey s : surveys) {
            if (s.getName().equals(surveyName)) {
                // set the searched for survey with the survey to return
                responses = s.getSurveyResponses();
            }

        }
        // return the reposnes for the survey searched for
        return responses;
    }

    // Get average answer for a survey
    public static double getSurveyAverage(Survey survey) {
        double average = 0;
        if (survey.getSurveyResponses() != null) {
            average = survey.getAverageResponse();
        } else {
            average = 0;
        }
        return average;
    }

    // Get standard deviation of answers for a survey
    public static double getStdDevSurvey(Survey survey) {
        double stdDev = 0;
        if (survey.getSurveyResponses() != null) {
            stdDev = survey.getStdDeviation();
        } else {
            stdDev = 0;
        }
        return stdDev;

    }

    // Get highest answer from a survey
    public static Integer getHighestAnswer(Survey survey) {
        int maximum = 0;
        if (survey.getSurveyResponses() != null) {
            maximum = survey.getMaximumAnswer();
        } else {
            maximum = 0;
        }
        return maximum;

    }

    // Get lowest answer from a survey
    public static Integer getLowestAnswer(Survey survey) {
        int minimum = 0;
        if (survey.getSurveyResponses() != null) {
            minimum = survey.getMinimumAnswer();
        } else {
            minimum = 0;
        }
        return minimum;

    }

     // Get average answer for a question 
     public static double getQuestionAverage(Survey survey, int question) {
        double average = 0;
        if (survey.getSurveyResponses() != null) {
            average = survey.getQuestionAverage(question);
        } else {
            average = 0;
        }
        return average;
    }

}