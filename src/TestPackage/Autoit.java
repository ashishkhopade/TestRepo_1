package TestPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(3000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("scroll(0,1000)");
		WebElement btn=driver.findElement(By.xpath("//input[@class='upload_txt' and @type='file']"));
		Actions action=new Actions(driver);
		action.click(btn).perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\AutoITScript\\file_upload.exe");
	}

}
