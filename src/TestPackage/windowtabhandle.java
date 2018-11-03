package TestPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowtabhandle {
	public static void main(String[] args) throws InterruptedException {
		//window tab handling
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//hit the url
		driver.get("https://www.irctc.co.in/nget/train-search");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement food=driver.findElement(By.xpath("//div[@class='h_head2']/nav/ul/li[6]/a"));
		//perform mouse action on webelement
		Actions action=new Actions(driver);
		action.moveToElement(food).perform();
		//explicit wait
		Thread.sleep(3000);
		WebElement ecatbtn=driver.findElement(By.linkText("E-Catering"));
		ecatbtn.click();
		//we can also use action.click() to click on webelement as like follows
		//action.moveToElement(ecatbtn).click().perform();
		Thread.sleep(3000);
		System.out.println("**************************New Tab Handling In Selenium***********************");
		//to get count of total windows opened
		Set<String> allwin=driver.getWindowHandles();
		int windowscount=allwin.size();
		System.out.println("Total no.of windows opened are : "+windowscount);
		String parent=driver.getWindowHandle();
		// parent title and url printing
				System.out.println("Parent window title is :"+driver.getTitle());
				System.out.println("Parent window URL is :"+driver.getCurrentUrl());
				for(String child:allwin)
				{
					if(!parent.equals(child))
					{
						//to switch child window
						driver.switchTo().window(child);
						System.out.println("Child window title is :"+driver.getTitle());
						System.out.println("Child window URL is :"+driver.getCurrentUrl());
						driver.close();
					}
				}
				//to switch back parent window
				driver.switchTo().window(parent);
		}

}

