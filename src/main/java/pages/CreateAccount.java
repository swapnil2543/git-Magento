package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

	private WebDriver ldriver; 

	@FindBy (xpath = "(//a[text()='Create an Account'])[1]")
	private WebElement createAnAccount;

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@id='password-confirmation']")
	private WebElement confirmPass;

	@FindBy(xpath = "//button/span[text()='Create an Account']")
	private WebElement createAccountButton;

	public CreateAccount(WebDriver driver)
	{
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCreateAccountLink()
	{
		createAnAccount.click();
	}

	public void enterFirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}

	public void enterLastName(String lastname)
	{
		lastName.sendKeys(lastname);
	}

	public void enterEmailAddress(String emailid)
	{
		email.sendKeys(emailid);
	}

	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
		confirmPass.sendKeys(pass);
	}

	public void clickOnCreateAnAccountButton()
	{
		createAccountButton.click();;
	}



}
