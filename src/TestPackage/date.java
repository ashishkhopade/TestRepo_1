package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class date {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		Thread.sleep(3000);
		String expmonyear="January-2018";
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
			date();
		}

	}
	public static void date() {
		String expdate="29";
		//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[2]
		String xpath1="//table[@class='ui-datepicker-calendar']/tbody/tr[";
		String xpath2="]/td[";
		String xpath3="]";
		//code to select expected date
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=7; k++) {
				
				String caldate=xpath1+j+xpath2+k+xpath3;
				String actdate=driver.findElement(By.xpath(caldate)).getText();
				//System.out.println(actdate);
				if(actdate.equals(expdate)) {
					driver.findElement(By.xpath(caldate)).click();
					System.out.println("Date selected");
					break;
				}
			}
			}
	}

}
