package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startApplication {
	
public static WebDriver driver;
	
	public void loginToApp(String usernameValue, String passwordValue) throws InterruptedException {
		//set gecko drivers
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");	  
		driver=new FirefoxDriver();
		
		//hit the url
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(usernameValue);
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(passwordValue);
		
		WebElement button=driver.findElement(By.xpath("//input[@value='Log In']"));
		button.click();
		
	}

}
