Feature: Automation Practice Homepage 

Scenario: To validated that user is in correct application 

	Given I should have valid URL 
	When I open browser 
	And I paste the URL 
	And I click on Enter key from keyboard 
	Then I should be in Automation Practice application 
	
Scenario: As a user i should be able to see sign in page 

	When I click on sign in link 
	Then I should be in sign in page 
	
	
Scenario: As a user, I should be able to view Customer service page 

	When I click on Contact Us link 
	Then I should be in Customer Service contact page