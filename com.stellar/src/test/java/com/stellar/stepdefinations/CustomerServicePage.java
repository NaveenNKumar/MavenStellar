package com.stellar.stepdefinations;

import com.stellar.general.OpenBrowserAndLaunchURL;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CustomerService;
import seleniumFunctions.DropDown;

public class CustomerServicePage extends OpenBrowserAndLaunchURL {

	DropDown dd = new DropDown();
	CustomerService cst = new CustomerService();

	@When("^I click on Subject Heading dropdown and select \"([^\"]*)\" value$")
	public void selectSubjectHeading(String arg1) throws Throwable {
		dd.byVisibleText(cst.dropdown_SubjectHeading(driver), arg1);
	}

	@When("^I enter \"([^\"]*)\" in Email address field$")
	public void i_enter_in_Email_address_field(String arg1) throws Throwable {
	}

	@When("^I enter order reference number$")
	public void i_enter_order_reference_number() throws Throwable {

	}

	@When("^I browse and attach file$")
	public void i_browse_and_attach_file() throws Throwable {

	}

	@When("^I enter message$")
	public void i_enter_message() throws Throwable {

	}

	@When("^I click on Send button$")
	public void i_click_on_Send_button() throws Throwable {

	}

	@Then("^I should see successfull message$")
	public void i_should_see_successfull_message() throws Throwable {

	}

}
