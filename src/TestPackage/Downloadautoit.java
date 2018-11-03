package TestPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadautoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.linkText("3.14.0"));
		link.click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("E:\\AutoITScript\\download.exe");
	}

}
