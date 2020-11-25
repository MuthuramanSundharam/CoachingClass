@Registerfeature
Feature: Register feature

Scenario: Success in Registration
Given user in the coaching class page
When verify the title of the page
And verify the text on the page 
And alert box displays for firstname
And user enters first name
And alert box displays for lastname
And user enters last name
And user enters email detail
And alert box display for mobile
And user enters mobile detail
And user select type of tution required
And user selects city
And user selects mode of learning
And alert box for enquiry details
And user enters enquiry details
And user clicks on submit button
And user verifies thank youy for submission
And user verifies after submission form
Then browser closes


