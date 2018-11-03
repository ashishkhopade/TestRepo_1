package TestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {
	//public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down
		js.executeScript("scroll(0,1600)");
		
		Thread.sleep(6000);
        //scroll up
		js.executeScript("scroll(0,-500)");
		js.executeScript("scroll(500,0)");
	}

}
