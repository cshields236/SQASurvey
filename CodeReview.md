# Code Review 

## Introduction
Code reviewing is a vital part of the software development cycle. Code reviewing is a quality assurance process that we must follow. Here code must be analysed manually by a member or members of the team before it can be merged. The purpose of the code review process is to find bugs, resolve erros, make sure coding standards are follwed and to improve code qualty.

## Code Review Checklist 
Here we will cover areas that must be followed whenever carrying out a code review. 

- **Design**: Ensure that the code is well designed and appropriate for the system.
- **Functionality**: Ensure that the code behaves as likely intended by the author. Ensure that the code behaves correclty for the user. 
- **Complexity**:  Ensure that the code is implemented as simple as possible. 
Ensure that another developer would be able to pick up  the code and have a full understanding of what is happening. 
- **Testing**: Ensure that, if required, the code has automated tests implemented that are well-designed and properly test what the functionality the method should carry out.
- **Naming** - Ensure that variables, methods, classes etc. have clear names which are easily understandable. 
- **Style** - Ensure that the code follows the style guidelines set out. 
- **Documentation**:  Ensure that the developer has updated or added documentation in regard to the feature, if required. 

## Code Review Best Practices 

### Reviewer
_______________
- Do not be afraid to give **honest feedback**.
- **Be clear** with your feedback and if possible discuss issues found with the developer in person.
- Do not be afraid to **ask questions** on why they choose a certain way of implmenting. As well as being a tool for software quality assurance, code reviewing should be used as a learning tool for both the reviewer and the author.
- Employ the **correct tone**, try to be constructive instead of critical. 
- **Limit nit-picking**, try to stay away from focusing on low priority issues in your review and focus on the main structure of the commits. 
### Author 
_______________
- **Respond** to all comments left on a code review.
- **Explain** your rationale behind your commit.
- Don't be afraid to **back your work** and if possible organise a meeting with the reviewer to go through your reasoning. 


## Links
- [Example Code Review](https://github.com/cshields236/SQASurvey/pull/3)
- [Home](README.md)