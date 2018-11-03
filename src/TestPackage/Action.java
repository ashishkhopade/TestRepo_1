package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		//to close login window
		WebElement button=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		button.click();
		Thread.sleep(3000);
		WebElement Electronics=driver.findElement(By.xpath("//*[text()='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(Electronics).perform();
	}

}
