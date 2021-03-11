Feature: Leaftaps Login Functionality

#Background:
#Given Launch the chrome browser
#And Load the application URL

@smoke
Scenario: To check the functionality of login page with positive credentials
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on the login button
Then Homepage should be displayed

@smoke @functional
Scenario Outline: To check the functionality of login page with negative credentials
Given Enter the username as <username>
And Enter the password as <password>
When Click on the login button
But Error Message should be displayed

Examples:
|username|password|
|demosalesmanager123|crmsfa123|
|demosalesmanager||
||crmsfa|

@Test
Scenario: Login into the application using DataTable
Given Enter the credentials to login to the application
		|Demosalesmanager||crmsfa|	
When click on the login button
#Then Homepage should be displayed
 

 
