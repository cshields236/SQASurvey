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
}