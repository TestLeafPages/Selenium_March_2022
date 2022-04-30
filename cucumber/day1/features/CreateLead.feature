Feature: Create Lead functionality of Leaftaps application

Background:
Given Open the chrome browser
And Load the application url


Scenario: TC003_Create new lead with mandatory information
Given Enter the username as 'Demosalesmanage'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed