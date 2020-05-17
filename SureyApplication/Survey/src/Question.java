public class Question {
    
    private String question;
    private int answer;
    // Question Constructers
    public Question() {
    }

    public Question(String question) {
		this.question = question;

	}


    //Question getter and setter 

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getAnswer() {
        return this.answer;
    }

    public void setAnswer(int answer) {

        // Check to see that number is valid, if not thorw an exception
        if (answer > 0 &&  answer <= 5){

            this.answer = answer;
        }
        else {
            throw new IllegalArgumentException("Answer for question must be between 1 & 5");
        }
       
    }
 

 

    
}