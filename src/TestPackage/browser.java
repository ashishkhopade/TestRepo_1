package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {
		public static void main(String[] args) throws InterruptedException {
		//set gecko drivers
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");	  
		WebDriver driver=new FirefoxDriver();
		//hit the url
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement Title=driver.findElement(By.xpath("//title[@id='pageTitle']"));
		String actualtitle=Title.getText();
		System.out.println(actualtitle);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("jeevan.khopade@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("mylovetod");
		WebElement button=driver.findElement(By.xpath("//input[@value='Log In']"));
		button.click();
		//driver.close();
	}
}
