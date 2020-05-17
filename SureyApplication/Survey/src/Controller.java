import java.util.ArrayList;

public class Controller {

    public Survey createEmptySurvey(){
        Survey s = new Survey();
        return s;
    }
    
    public Survey createSurvey(ArrayList<Question> surveyQuestions)
	{		

		ArrayList<Question> questions = surveyQuestions;
		Survey s = new Survey("Questions" ,questions);
		return s;
    }
    // Take in a survey and question and add the question to the survey
    public void addQuestion(Survey s, Question q){
        s.addQuestion(q);
    }

}