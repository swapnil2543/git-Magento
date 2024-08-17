package stefdefination;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateAccount;
import pages.LoginFunctionality;
import pages.MyAccount;
import utilities.BaseClass;

public class SignInFunctionality extends BaseClass{

	CreateAccount ca;
	LoginFunctionality lf;
	MyAccount ma;
	WebDriver driver;

	@Given("User launch browser")
	public void user_launch_browser() {
		this.driver = super.initialisation();

		ca = new CreateAccount(driver);
		lf = new LoginFunctionality(driver);
		ma = new MyAccount(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}


	@Given("User opens portal {string}")
	public void user_opens_portal(String url) {
		driver.get(url);


	}

	@When("User click on create an Account link")
	public void user_click_on_create_an_account_link() {


		ca.clickOnCreateAccountLink();

	}

	@When("User add firstname as {string}, lastname as {string}, email as {string}, password as {string} & confirm password as {string}")
	public void user_add_firstname_as_lastname_as_email_as_password_as_confirm_password_as(String fname, String lname, String email, String pass, String cpass) {

		ca.enterFirstName(fname);
		ca.enterLastName(lname);
		ca.enterEmailAddress(email);
		ca.enterPassword(pass);

	}

	@When("User click on Create an Account button")
	public void user_click_on_create_an_account_button() {
		ca.clickOnCreateAnAccountButton();
	}

	@Then("User should see My Account Page")
	public void user_shold_see_my_account_page() {

		String myTitle = driver.getTitle();
		if(myTitle!=("My Account"))
		{
			Assert.assertTrue(true);
			System.out.println("User already Registered");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("New User Registered successfully");
		}

	}


	@Then("User close the browser")
	public void user_close_the_browser() {
		driver.close();
	}

	@When("User click on Sign In link")
	public void user_click_on_sign_in_link() {

		lf.clickOnSignInLink();

	}

	@When("User add email as {string} & password as {string}")
	public void user_add_email_as_password_as(String email, String pass) {
		lf.enterEmail(email);
		lf.enterPass(pass);
	}

	@When("User hit on sign In button")
	public void user_hit_on_sign_in_button() {
		lf.clickOnSignInBtn();

	}

	@Then("Dashboard page title capture by user")
	public void dashboard_page_title_capture_by_user() {

		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Home Page"))

		{
			Assert.assertTrue(true);
			System.out.println("Page Title Matched");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("Page Title not Matched");
		}

	}

	@Then("User click on Signout option from dropdown")
	public void user_click_on_signout_option_from_dropdown() throws InterruptedException {

		ma.clickOnMenuArrow();
		Thread.sleep(3000);
		ma.clickOnSignOut();
	}


}
