# Team Version Control 
In order to manage version control in this project I used Git and GitHub. I also used GitFlow processes in order to manager version control over in a team environment. 

## Gitflow 
Gitflow is a branching model for git for use in teams. It envolves using a develop and a master branch as the building blocks of your project. Developers then create feature branches from the develop branch and merge back once the feature is completed and tested. The develop branch is then eventually merged back to the master branch for releases. 

Developer create feature branches off of the develop branch so as more than one developer can work on new features and not affect the code base. 

The use of this branching models allows for reduced code breakage and easier code reviews as features are self contained in branches.  

## Gitflow in this project 
Below I will give an outline of the branching used in this project

- [**master**](https://github.com/cshields236/SQASurvey): The master branch contains the completed projected, this is used as the release branch.
- [**develop**](https://github.com/cshields236/SQASurvey/tree/develop): The develop branch contains all the work on current feature release. Contains a history of all features being worked on for a release. Developers branch off this branch when creating new feature branches.  

### Feature Branches
- [**survey-dev**](https://github.com/cshields236/SQASurvey/tree/survey-dev): This branch deals with the initial implementation of the survey feature of the application. Contains features and tests for the creation and use of the survey objects. 
- [**survey-response-dev**](https://github.com/cshields236/SQASurvey/tree/survey-response-dev): This branch contains implementation and testing of features relating to the survey response. Such as creating, adding and getting all responses. 
- [**survey-calculation-dev**](https://github.com/cshields236/SQASurvey/tree/survey-calculations-dev): This branch contains the implementation and testing of the survey calculations feature. Here calculations of average, standard deviation, minimum and maximum are carried out an a survey. 
- [**question-calculation-dev**](https://github.com/cshields236/SQASurvey/tree/question-calculation-dev): This branch contains the implementation and testing of the questions calculations feature. Here calculations of average, standard deviation, minimum and maximum are carried out an a specific question from a survey. 
- [**sprint-planning**](https://github.com/cshields236/SQASurvey/tree/sprint-planning): This branch contains Sprint Planning documentation. This contains the backlog and time estimates. 
- [**code-review-doc**](https://github.com/cshields236/SQASurvey/tree/code-review-doc): This branch contains Code Review documentation. This contains the code reviewing checklist and best practices for code reviewing. 
- [**test-coverage-metric-doc**](https://github.com/cshields236/SQASurvey/tree/test-coverage-metric-doc): This branch contains Test Coverage Metric documentation. This contains information on the metric I choose and images displaying the test coverage for this project.
- [**tdd-doc**](https://github.com/cshields236/SQASurvey/tree/tdd-doc): This branch contains Test Driven Devlopment documentation. This contains information on Test Driven Development and an example Test Driven Development flow from the project. 
- [**git-flow-doc**](https://github.com/cshields236/SQASurvey/tree/git-flow-doc): This branch contains this Git Flow documentation.
  

