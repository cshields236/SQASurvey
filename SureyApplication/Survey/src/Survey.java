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

    /*
     * Survey calculations
     */

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
                // update answer totals
                total++;
                // Update the value with the single response
                totalResponses += singleResponse;
            }

        }
        // calculate average
        average = (double) totalResponses / (double) total;
        return average;
    }

    public double getStdDeviation() {

        double stdDev = 0.0;
        double mean = getAverageResponse();
        int total = 0;

        for (SurveyResponse sResponse : this.surveyResponses) {

            // Get a single response to the survey
            for (int singleResponse : sResponse.getAnswers().values()) {
                // update total number of questions
                total++;
                // Update the standard deviation value by taking the response away from the
                // average and raising it by two
                stdDev += Math.pow(singleResponse - mean, 2);
            }
        }
        return Math.sqrt(stdDev / total);
    }

    public Integer getMaximumAnswer() {
        // Initially sets the maximum value to the first answer
        int highest = surveyResponses.get(0).getAnswers().get(1);

        for (SurveyResponse sResponse : this.surveyResponses) {

            // Get a single response to the survey
            for (int singleResponse : sResponse.getAnswers().values()) {
                // Checks to see if the current answer is larger than the largest
                if (singleResponse > highest) {
                    // if it is, updates the largest value
                    highest = singleResponse;
                }
            }
        }
        return highest;

    }

    public Integer getMinimumAnswer() {
        // Initially sets the maximum value to the first answer
        int lowest = surveyResponses.get(0).getAnswers().get(1);

        for (SurveyResponse sResponse : this.surveyResponses) {

            // Get a single response to the survey
            for (int singleResponse : sResponse.getAnswers().values()) {
                // Checks to see if the current answer is larger than the largest
                if (singleResponse < lowest) {
                    // if it is, updates the lowest value
                    lowest = singleResponse;
                }
            }
        }
        return lowest;
    }

    /*
     * Specific Question calculations
     */
    public double getQuestionAverage(int selectedQuestion) {
        // Initialise values for calculation of average
        int total = 0;
        int totalResponses = 0;
        double average = 0;
        // Get all responses to the survey
        for (SurveyResponse sResponse : this.surveyResponses) {
            totalResponses++;
            // get the answer for the specific question
            total += sResponse.getAnswers().get(selectedQuestion);

        }
        // calculate average
        average = (double) total / (double) totalResponses;
        return average;

    }

    public double getQuestionStdDeviation(int selectedQuestion) {

        double stdDev = 0.0;
        double mean = getQuestionAverage(selectedQuestion);
        int total = 0;

        for (SurveyResponse sResponse : this.surveyResponses) {

            // Get a single response to the survey
            for (int singleResponse : sResponse.getAnswers().values()) {
                // update total number of questions
                total++;
                // Update the standard deviation value by taking the response away from the
                // average and raising it by two
                stdDev += Math.pow(sResponse.getAnswers().get(selectedQuestion) - mean, 2);
            }
        }
        return Math.sqrt(stdDev / total);
    }


    public Integer getQuestionMaximumAnswerSpecific(int selectedQuestion) {
        // Initially sets the maximum value to the first answer
         // Initialise values for calculation of average
         int maximum = 0;
         
         // Get all responses to the survey
         for (SurveyResponse sResponse : this.surveyResponses) {
             // get the answer for the specific question
             if (maximum <  sResponse.getAnswers().get(selectedQuestion)){
                maximum = sResponse.getAnswers().get(selectedQuestion);
             }
 
         }
         // Return maximum answer
         return maximum;

    }
}
