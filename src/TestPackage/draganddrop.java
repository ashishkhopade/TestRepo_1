package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
        Actions action=new Actions(driver);
        action.dragAndDrop(From, To).build().perform();
        WebElement From1=driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
        WebElement To1=driver.findElement(By.xpath("//*[@id='amt7']/li"));
        action.clickAndHold(From1).perform();
        action.moveToElement(To1).click().perform();
        
	}

}
