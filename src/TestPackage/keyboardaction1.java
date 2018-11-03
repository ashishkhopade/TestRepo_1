package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.shop.theTestingworld.com");
		Thread.sleep(3000);
		driver.findElement(By.name("search")).sendKeys("Iphone");
		//WebElement button=driver.findElement(By.xpath("//div[@id='search']//button[@type='button']"));
		Actions action=new Actions (driver);
		action.sendKeys(Keys.ENTER).perform();

}
}
