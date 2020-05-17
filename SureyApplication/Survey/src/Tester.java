import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Tester {

    // Create controller object
    Controller controller = new Controller();

    @Test
    public void TestEmptySurveyCreation() {
        Survey s = controller.createEmptySurvey();

        assertTrue("Should create a survey object", s instanceof Survey);
    }

    // test creating a survey with a question 
    @Test
    public void TestSurveyCreation(){
        Question q1 = new Question("Question One");
        ArrayList<Question> surveyQs = new ArrayList<Question>();

        surveyQs.add(q1);

        Survey s = controller.createSurvey(surveyQs);


        assertTrue("Should create a survey object with question added", s.getQuestions().get(0).getQuestion().equals("Question One"));
    }


    @Test 
	public void TestAddQuestion()
	{
		// Create Empty survey
        Survey s = controller.createEmptySurvey();
        // Create new question object
        Question one = new Question("Test Added Question");
        // call on method in controller class to add the question to the survey
        controller.addQuestion(s, one);
		assertTrue("Question Should be added to survey", s.getQuestions().get(0).getQuestion().equals("Test Added Question"));
	}

}