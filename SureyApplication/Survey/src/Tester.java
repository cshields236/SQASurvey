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
    public void TestSurveyCreation() {
        Question q1 = new Question("Question One");
        ArrayList<Question> surveyQs = new ArrayList<Question>();

        surveyQs.add(q1);

        Survey s = controller.createSurvey("Test Survey", surveyQs);

        assertTrue("Should create a survey object with question added",
                s.getQuestions().get(0).getQuestion().equals("Question One"));
    }

    @Test
    public void TestAddQuestion() {
        // Create Empty survey
        Survey s = controller.createEmptySurvey();
        // Create new question object
        Question one = new Question("Test Added Question");
        // call on method in controller class to add the question to the survey
        controller.addQuestion(s, one);
        assertTrue("Question Should be added to survey",
                s.getQuestions().get(0).getQuestion().equals("Test Added Question"));
    }

    @Test
    public void TestRetriveSpecificSurvey() {
        // Create a series of surveys
        Survey s1 = new Survey("Survey One");
        Survey s2 = new Survey("Survey Two");
        Survey s3 = new Survey("Survey Three");
        Survey s4 = new Survey("Survey Four");

        // add all these surveys to a collcection
        ArrayList<Survey> surveys = new ArrayList<Survey>();

        surveys.add(s1);
        surveys.add(s2);
        surveys.add(s3);
        surveys.add(s4);

        // search for the specific survey
        Survey specificS = controller.retriveSpecificSurvey(surveys, "Survey One");

        assertTrue("Should return survey one", specificS.getName().equals("Survey One"));

    }

    @Test
    public void TestRetriveAll() {
        // Create a series of surveys
        Survey s1 = new Survey("Survey One");
        Survey s2 = new Survey("Survey Two");
        Survey s3 = new Survey("Survey Three");
        Survey s4 = new Survey("Survey Four");

        // add all these surveys to a collection
        ArrayList<Survey> surveys = new ArrayList<Survey>();

        surveys.add(s1);
        surveys.add(s2);
        surveys.add(s3);
        surveys.add(s4);

        // retrieve all the surveys created
        ArrayList<Survey> returnedSurveys = new ArrayList<Survey>();
        returnedSurveys = controller.retriveAllSurveys(surveys);

        assertTrue("Should return survey one", returnedSurveys.size() == 4);

    }

    @Test
    public void TestAddSurveyResponse() {

        // Add three questions to the survey
        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        // Crate Questions list
        ArrayList<Question> surveyQs = new ArrayList<Question>();

        // Add Questions to list
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);
        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey ", surveyQs);
        // Create answers for survey responses
        int r1 = 3;
        int r2 = 2;
        int r3 = 4;
        // call on method to create
        SurveyResponse response = controller.createNewSurveyResponse(s, r1, r2, r3);
        
        assertTrue("Should return the survey response created" , response.getAnswers().size() == 3);

    }

}