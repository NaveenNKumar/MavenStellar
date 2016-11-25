package com.stellar.stepdefinations;

import com.stellar.general.OpenBrowserAndLaunchURL;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CustomerService;
import pageObjects.Home;
import pageObjects.Signin;
import seleniumFunctions.GetText;
import seleniumFunctions.Link;

public class Homepage extends OpenBrowserAndLaunchURL {

	OpenBrowserAndLaunchURL op1 = new OpenBrowserAndLaunchURL();
	GetText gt = new GetText();
	Home hp = new Home();
	Link ln = new Link();
	Signin sn = new Signin();
	CustomerService cst = new CustomerService();

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
	public void launchApplication() throws Throwable {

		op1.openBrowser();

	}

	@Then("^I should be in Automation Practice application$")
	public void checkApplication() throws Throwable {
		System.out.println("Application title : " + driver.getTitle());
		gt.getText(hp.txt_phnnumber(driver));

	}

	@When("^I click on sign in link$")
	public void clickonsignin() throws Throwable {

		Thread.sleep(5000);
		ln.linkclick(hp.lnk_signin(driver));

	}

	@Then("^I should be in sign in page$")
	public void signinpage() throws Throwable {

		Thread.sleep(3000);
		gt.getText(sn.txt_Authentication(driver));

	}

	@When("^I click on Contact Us link$")
	public void clickContactuslink() throws Throwable {
		Thread.sleep(10000);
		ln.linkclick(hp.lik_Contact(driver));

	}

	@Then("^I should be in Customer Service contact page$")
	public void checkCustomerPage() throws Throwable {
		gt.getText(cst.txt_CustomerService(driver));
		System.out.println();
	}

}
