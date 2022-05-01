@Login
Feature: Login functionality of Leaftaps application

#Background:
#Given Open the chrome browser
#And Load the application url

@functional @regression @InSprint
Scenario Outline: TC001_Login with positive credential
#And Enter the username as 'Demosalesmanager' and password as 'crmsfa'
Given Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@regression @functional @PatchRelease
Scenario: TC002_Login with negative credential
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on Login button
But Error message should be displayed