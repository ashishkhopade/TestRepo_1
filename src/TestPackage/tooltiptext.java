package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tooltiptext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//explicit wait
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.linkText("Hover over me"));
		String title=element.getAttribute("title");
		System.out.println("Tool tip text:"+title);
		

	}

}
