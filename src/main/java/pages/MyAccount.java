package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	WebDriver ldriver;
	
	@FindBy(xpath = "(//button[@class='action switch'])[1]")
	private WebElement menuToggle;
	
	@FindBy(xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/'])[1]")
	private WebElement signOut;

	
	public MyAccount(WebDriver driver)
	{
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuArrow()
	{
	
		menuToggle.click();
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
}
