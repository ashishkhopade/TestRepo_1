package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class datepicker1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		Thread.sleep(3000);
		String expmonyear="September-2018";
		driver.findElement(By.id("datepicker1")).click();
		String currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		//System.out.println(currmonth);
		String curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		//System.out.println(curryear);
		String currmonyear=currmonth+"-"+curryear;
		//System.out.println(currmonyear);
		
		//checking current month and year equals to expected month and year
		if(currmonyear.equals(expmonyear)) {
			System.out.println("month already selected just select date");
			Thread.sleep(1000);	
			
			String expdate="30";			
			//code to select expected date
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement date : dates) {
				String s1=date.getText();
					System.out.println(s1);
					if (s1.equals(expdate)) {
						currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
						curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
						String setdate=currmonth+" "+s1+","+" "+curryear;
						WebElement entered_date=driver.findElement(By.xpath("//input[@id='datepicker1']"));//.sendKeys(setdate);
						entered_date.sendKeys(setdate);
						Actions action=new Actions (driver);
						action.sendKeys(Keys.ENTER).perform();
						System.out.println("Date selected");
						break;
					
					}
				}
				}
			
		else
		{
			//code to select expected month
			for(int i=1; i<12; i++)
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				Thread.sleep(1000);
				currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				currmonyear=currmonth+"-"+curryear;
				if(currmonyear.equals(expmonyear)) {
					System.out.println("match found");
					break;
				}
			}
			Thread.sleep(3000);	
			String expdate="30";			
			//code to select expected date
			List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			for(WebElement date : dates) {
				String s1=date.getText();
					System.out.println(s1);
					if (s1.equals(expdate)) {
						currmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
						curryear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
						String setdate=currmonth+" "+s1+","+" "+curryear;
						WebElement entered_date=driver.findElement(By.xpath("//input[@id='datepicker1']"));//.sendKeys(setdate);
						entered_date.sendKeys(setdate);
						Actions action=new Actions (driver);
						action.sendKeys(Keys.ENTER).perform();
						System.out.println("Date selected");
						break;		
					}
			}
		}
	}
}
