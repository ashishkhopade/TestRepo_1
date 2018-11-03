package TestPackage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class crossBrowser {
	
	public WebDriver driver;
	
	@Parameters({"browsers"})
	@Test()
	public void driverSetup(String browser) throws InterruptedException {
		
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");//setup driver property
			driver=new FirefoxDriver();
			//driver.get("http://automationpractice.com");
			//Thread.sleep(2000);
		}
		else if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwear\\chrome_driver\\chromedriver.exe");
			driver= new ChromeDriver();
			//driver.get("http://automationpractice.com");
			//Thread.sleep(2000);
		}
		//driver.get("http://automationpractice.com");
		Thread.sleep(2000);
	}
	

}
