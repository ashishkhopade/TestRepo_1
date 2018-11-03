package TestPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newwindowhandle {
	
	public static void main(String[] args) throws InterruptedException {
		//window switching
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//hit the url
		driver.get("https://toolsqa.com/automation-practice-switch-windows/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to print title of parent window
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		Thread.sleep(3000);
		System.out.println("******************window handler info**************");
		Set<String> allwin=driver.getWindowHandles();
		System.out.println("Total no.of windows opened are : "+allwin.size());
		Iterator<String> itrallwin=allwin.iterator();
		String parent=itrallwin.next();
		String child=itrallwin.next();
		//System.out.println("Parent : "+parent);
		//System.out.println("Child : "+child);
		//parent window info
		String exptitle="A new title is here";
		String acttitle=driver.getTitle();
		System.out.println("Parent window title : "+acttitle);
		System.out.println("Parent URL : "+driver.getCurrentUrl());
		if(exptitle.equals(acttitle))
		{
			driver.switchTo().window(child);
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		String exptitle1="QA Automation Tools Tutorial";
		String acttitle1=driver.getTitle();
		if(exptitle1.equals(acttitle1))
		{
		System.out.println("Child window title : "+acttitle1);
		System.out.println("Child Url : "+driver.getCurrentUrl());
		//driver.close();
		}
		else
			System.out.println("Child title not match");
		driver.switchTo().window(parent);
		driver.close();
		
	}
	
}
