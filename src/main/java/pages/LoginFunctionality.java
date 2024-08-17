package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {
	
	private WebDriver hdriver; 

	@FindBy (xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
	private WebElement SignIn;
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement eemailfield;
	
	@FindBy (xpath = "(//input[@id='pass'])[1]")
	private WebElement passwordfield;
	
	@FindBy (xpath = "(//button[@id='send2'])[1]")
	private WebElement SignInBtn;
	
	public LoginFunctionality(WebDriver driver)
	{
		this.hdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInLink()
	{
		SignIn.click();
	}
	
	public void enterEmail(String email)
	{
		eemailfield.clear();
		eemailfield.sendKeys(email);
	}
	
	public void enterPass(String pass)
	{
		passwordfield.clear();
		passwordfield.sendKeys(pass);
	}
	
	public void clickOnSignInBtn()
	{
		SignInBtn.click();
	}

}
