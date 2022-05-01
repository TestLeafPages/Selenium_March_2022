@CreateLead @Leads
Feature: Edit Lead functionality of Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @smoke
Scenario: TC004_Edit lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on CRMSFA link
Then MyHome page should be displayed