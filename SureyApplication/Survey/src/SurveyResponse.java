import java.util.HashMap;
public class SurveyResponse{
    
    private HashMap<Integer, Integer> surveyAnswers;

    public SurveyResponse() {
    }

    public SurveyResponse(HashMap<Integer, Integer> surveyAnswers) {
        this.surveyAnswers = surveyAnswers;
    }

    
    public HashMap<Integer, Integer> getAnswers() {
        return surveyAnswers;
    }

    public void setAnswers(HashMap<Integer, Integer> surveyAnswers) {
        this.surveyAnswers = surveyAnswers;
    }
}