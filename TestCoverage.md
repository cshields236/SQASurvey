# Test Coverage
The metric I used to analyse the projects test coverage was **EclEmma**. This is a free code coverage metric tool made specifically for Java and easily implemented through the Eclipse platform. 

## How To Use
The test coverage metric is built into Eclipse so there are no implementation steps. 

Simply, click on the run button in the eclipse menu and a report will be generated.

![Image of Launch](Images/launchtoolbar.gif)

Clicking the first butto analyses your project and generates a report based on the test coverage present. You will get percentages of coverage of the whole project and then a break down of each classes coverage. 


![Image of Test Coverage Percentage](Images/testCoverage.png)

## What To Look For
Here we can see that the coverage of code covered by tests in my application is 97.1%. This is a high enough percentage to be confident we are testing all the features of the project. There is no need, and in some cases imporababale, to strive for 100% test coverage. 

We Should always be looking for a code coverage percentage of over 70%. This ensures we are testing the main computational features of the project, although other projects may vary as to how high of a coverage percentage is needed. A developer should know when to stop testing when the tests start becoming contrived to design. 

There is no need to write Unit Tests for low level tasks with no or minimal computation. An example of these types of methods are getter and setter methods 