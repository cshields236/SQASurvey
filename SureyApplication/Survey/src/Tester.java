import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void TestCreateSurveyResponse() {

        // Create answers for survey responses
        int r1 = 3;
        int r2 = 2;
        int r3 = 4;
        // call on method to create
        SurveyResponse response = controller.createNewSurveyResponse(r1, r2, r3);

        assertTrue("Should return the survey response created", response.getAnswers().size() == 3);

    }

    @Test
    public void TestAddSurveyResponseToSurvey() {

        ArrayList<Survey> surveys = new ArrayList<Survey>();

        // Add three questions to the survey
        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        // Create Questions list
        ArrayList<Question> surveyQs = new ArrayList<Question>();

        // Add Questions to list
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create new survey with title and questions
        Survey s = controller.createSurvey("Test", surveyQs);

        surveys.add(s);

        int r1 = 3;
        int r2 = 2;
        int r3 = 4;
        // call on method to create
        SurveyResponse response = controller.createNewSurveyResponse(r1, r2, r3);
        s.addSurveyResponse(response);
        // Get the specific survey
        Survey specificS = controller.retriveSpecificSurvey(surveys, "Test");

        assertTrue("Survey Responses should be added to the survey",
                specificS.getSurveyResponses().get(0).getAnswers().size() == 3);

    }

    @Test
    public void TestGetAllResponsesForSurvey() {
        ArrayList<Survey> surveys = new ArrayList<Survey>();
        ArrayList<SurveyResponse> surveyResponses = new ArrayList<SurveyResponse>();

        // Crete questions
        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // Create survey responses
        int r1 = 3;
        int r2 = 2;
        int r3 = 4;

        // create the survey response
        SurveyResponse response = controller.createNewSurveyResponse(r1, r2, r3);

        // Add response to the survey
        controller.addSurveyResponse(s, response);
        // Add survey to list
        surveys.add(s);
        // search for the survey with the title
        surveyResponses = controller.getAllSurveyResponses(surveys, "Example Survey");
        // get the responses for that survey

        assertTrue("Should return the survey responses for this survey", surveyResponses.size() == 1);

    }

    @Test
    public void TestSurveyAverage() {
        // Create Questions for survey

        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        int r1 = 3;
        int r2 = 2;
        int r3 = 4;

        // create the survey response
        SurveyResponse response = controller.createNewSurveyResponse(4, 3, 2);
        SurveyResponse response1 = controller.createNewSurveyResponse(3, 2, 4);

        // Add response to the survey
        controller.addSurveyResponse(s, response);
        controller.addSurveyResponse(s, response1);

        // retrieve survey average
        double average = controller.getSurveyAverage(s);

        assertEquals(average, 3);
    }

    @Test
    public void TestSurveyStandardDeviation() {
        // Create Questions for survey

        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // create the survey response
        SurveyResponse response = controller.createNewSurveyResponse(3, 2, 4);
        SurveyResponse response2 = controller.createNewSurveyResponse(4, 3, 2);

        // Add response to the survey
        controller.addSurveyResponse(s, response);
        controller.addSurveyResponse(s, response2);

        // retrieve survey standard deviation
        double std = controller.getStdDevSurvey(s);
        assertEquals(std, 0.816496580927726);
    }

    @Test
    public void TestSurveyMaximumAnswer() {
        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // create the survey response
        SurveyResponse response = controller.createNewSurveyResponse(3, 2, 4);
        //Add response to survey 
        controller.addSurveyResponse(s, response);
        // Get the maximum value for the survey
        int max = controller.getHighestAnswer(s);
        assertEquals(max, 4);
    }

    @Test
    public void TestSurveyMinimumAnswer() {
        
        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // create the survey response
        SurveyResponse response = controller.createNewSurveyResponse(3, 2, 4);
        //Add response to survey 
        controller.addSurveyResponse(s, response);
        // Get the minimum value for the survey
        int min = controller.getLowestAnswer(s);
        assertEquals(min, 2);
    }



    @Test
    public void TestQuestionAverage() {
        // Create Questions for survey

        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // create the survey response
        SurveyResponse response1 = controller.createNewSurveyResponse(4, 5, 2);
        SurveyResponse response2 = controller.createNewSurveyResponse(3, 3, 4);
        SurveyResponse response3 = controller.createNewSurveyResponse(3, 1, 4);

        // Add response to the survey
        controller.addSurveyResponse(s, response1);
        controller.addSurveyResponse(s, response2);
        controller.addSurveyResponse(s, response3);

        // retrieve question average
        double average = controller.getQuestionAverage(s, 2);

        // Answer for question 2 should be 3
        // as the three responses recorded 5,3,1 add up to 9 - 9/ 3 = 3
        assertEquals(average, 3);
    }

    @Test
    public void TestQuestionStandardDeviation() {
        // Create Questions for survey

        Question q1 = new Question("Test Added Question");
        Question q2 = new Question("Test Added Question");
        Question q3 = new Question("Test Added Question");
        ArrayList<Question> surveyQs = new ArrayList<Question>();
        surveyQs.add(q1);
        surveyQs.add(q2);
        surveyQs.add(q3);

        // Create survey with questions
        Survey s = controller.createSurvey("Example Survey", surveyQs);

        // create the survey response
        SurveyResponse response1 = controller.createNewSurveyResponse(4, 5, 2);
        SurveyResponse response2 = controller.createNewSurveyResponse(3, 3, 4);
        SurveyResponse response3 = controller.createNewSurveyResponse(3, 1, 4);
        SurveyResponse response4 = controller.createNewSurveyResponse(3, 2, 4);
        SurveyResponse response5 = controller.createNewSurveyResponse(3, 3, 4);
        SurveyResponse response6 = controller.createNewSurveyResponse(3, 4, 4);

        // Add response to the survey
        controller.addSurveyResponse(s, response1);
        controller.addSurveyResponse(s, response2);
        controller.addSurveyResponse(s, response3);
        controller.addSurveyResponse(s, response4);
        controller.addSurveyResponse(s, response5);
        controller.addSurveyResponse(s, response6);

        // retrieve question average
        double stdDev = controller.getQuestionStdDevSurvey(s, 2);

        // Answer for question 2 should be 3
        // as the three responses recorded 5,3,1 add up to 9 - 9/ 3 = 3
        assertEquals(stdDev, 1.2909944487358056);
    }
}