package com.stellar.stepdefinations;

import com.stellar.general.OpenBrowserAndLaunchURL;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage {
	
	OpenBrowserAndLaunchURL op1=new OpenBrowserAndLaunchURL();
	@Given("^I should have valid URL$")
	public void i_should_have_valid_URL() throws Throwable {
	    
	}

	@When("^I open browser$")
	public void i_open_browser() throws Throwable {
	   
		
	    
	}

	@When("^I paste the URL$")
	public void i_paste_the_URL() throws Throwable {
	   
	    
	}

	@When("^I click on Enter key from keyboard$")
	public void i_click_on_Enter_key_from_keyboard() throws Throwable {
	   
		op1.openBrowser();
	   
	}

	@Then("^I should be in Automation Practice application$")
	public void i_should_be_in_Automation_Practice_application() throws Throwable {
	    
	    
	}

}