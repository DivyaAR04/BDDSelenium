Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "batchautomation" and "Test@12345"
#Then user clicks on login button
#Then user is on home page

#NEW URL FOR FREE CRM IS  https://classic.crmpro.com


#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| username      | password   |
	|batchautomation| Test@12345 |
	| naveenk       | test@123   |
	|  tom          | test456    | 	

	
	#HERE THE DETAILS THAT WE HAVE GIVEN IN EXAMPLE IS CALLED AS SCENARIO OUTLINe
	#Scenario Outline is the same scenario can be executed for multiple sets of 
	#data using the scenario outline. The data is provided by a tabular structure 
	#separated by (| |). 
	
	
	
	