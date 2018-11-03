package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hiddentooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/tooltip/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//explicit wait
		Thread.sleep(3000);
		WebElement frame=driver.findElement(By.tagName("iframe"));
		//switch to frame
		driver.switchTo().frame(frame);
		System.out.println("Frame switched successfully");
		Thread.sleep(3000);
		WebElement age=driver.findElement(By.id("age"));
		Actions action=new Actions(driver);
		action.moveToElement(age).build().perform();
		Thread.sleep(2000);
		WebElement hiddentext=driver.findElement(By.xpath("//div[@class='ui-helper-hidden-accessible']/div[1]"));
		String actualHiddenText = hiddentext.getText();
		System.out.println(actualHiddenText);
		
		driver.close();

	}

}
