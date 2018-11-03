package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction2 {
	public static void main(String[] args) throws InterruptedException {
	//set gecko drivers
	System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");	  
	WebDriver driver=new FirefoxDriver();
	//hit the url
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("email")).sendKeys("jeevan.khopade@gmail.com");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.TAB).perform();
	action.sendKeys("mylove");
	action.sendKeys(Keys.ENTER).perform();
	}

}
