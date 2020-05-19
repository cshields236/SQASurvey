import java.util.ArrayList;
import java.util.HashMap;

public class Survey {

    private String name;
    private ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<SurveyResponse> surveyResponses = new ArrayList();

    // Empty constructor
    public Survey() {

    }

    // Constructor with name and questions
    public Survey(String name, ArrayList<Question> questions) {
        this.name = name;
        this.questions = questions;
    }

    // Constructor that takes just name
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

    public void addQuestion(Question question) {

        this.questions.add(question);
    }

    public ArrayList<SurveyResponse> addSurveyResponse(SurveyResponse surveyResponse) {
        ArrayList<SurveyResponse> response = new ArrayList();

        if (this.surveyResponses == null) {
            response.add(surveyResponse);

            this.surveyResponses = response;

        } else {
            this.surveyResponses.add(surveyResponse);
        }
        return this.surveyResponses;

    }

    public ArrayList<SurveyResponse> getSurveyResponses() {
        return this.surveyResponses;
    }

    public void setSurveyResponses(ArrayList<SurveyResponse> surveyResponses) {
        this.surveyResponses = surveyResponses;
    }

    // Method to get the average response for a survey
    public double getAverageResponse() {
        // Initialise values for calculation of average 
        int total = 0;
        int totalResponses = 0;
        double average = 0;
        // Get all responses to the survey
        for (SurveyResponse sResponse : this.surveyResponses) {
            // Get a single response to the survey
            for (int singleResponse : sResponse.getAnswers().values()) {
                // Update the value with the single response
                totalResponses += singleResponse;
            }
            // Get the total number of questions
            total = sResponse.getAnswers().size();
        }
        // calculate average 
        average = (double) totalResponses / (double) total;
        return average;
    }
}
