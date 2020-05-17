import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tester {
    
    // Create controller object
    Controller controller = new Controller();

    @Test
    public void TestEmptySurveyCreation(){
        Survey s = controller.createEmptySurvey();

        assertTrue("Should create a survey object",  s instanceof Survey);
    }
}