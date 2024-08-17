package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public WebDriver initialisation()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\eclipse-Velo-workspace\\com.magento\\Browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	

}
