Feature: Send a message 

Background: 
	When I click on Enter key from keyboard 
	And I click on Contact Us link 
	
Scenario: Send message to automation practice customer service 

	When I click on Subject Heading dropdown and select "Customer service" value 
	And I enter "abc@ncs.com" in Email address field 
	And I enter order reference number 
	And I browse and attach file 
	And I enter message 
	And I click on Send button 
	Then I should see successfull message.