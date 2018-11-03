package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframehandling {

	public static void main(String[] args) throws InterruptedException {
		//Handling Iframes 
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://toolsqa.com/iframe-practice-page");
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@title,'Messages')]")).click();
		
	}

}