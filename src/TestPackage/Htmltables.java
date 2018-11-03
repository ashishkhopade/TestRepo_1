package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Htmltables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		//Count number of rows
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		int rowcount=row.size();
		System.out.println("Total Rows : "+rowcount);
		List<WebElement> col=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td"));
		int colcount=col.size();
		System.out.println("Total columns : "+colcount);
		for (int i=0; i<=colcount-1; i++)
		{
			System.out.println("Column Value : "+col.get(i).getText());
		}
	
		
	}

}