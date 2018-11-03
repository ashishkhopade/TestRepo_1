package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///E:/selenium/TestProject/myframes.html");
		Thread.sleep(2000);
		driver.switchTo().frame("selenium_news");
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Click here for selenium Tutorial")).click();
		

	}

}
