package TestPackage;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01");
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.id("Carlist"));
		//select command for dropdownlist
		Select carlist= new Select(dropdown);
		//by visible text
		carlist.selectByVisibleText("Audi");
		Thread.sleep(3000);
		//by index
		carlist.selectByIndex(2);
		WebElement selected_index=carlist.getFirstSelectedOption();
		System.out.println("selected index value is : "+selected_index.getText());
		Thread.sleep(3000);
		//by value
		carlist.selectByValue("Renault Car");
		List<WebElement> total=carlist.getOptions();
		System.out.println("Total Options are : "+total.size());
		//for(int i=0;i<=total.size(); i++)
		//{
			//System.out.println(total.get(i).getText());
		//}
		for(WebElement eachoption : total)
		{
			System.out.println(eachoption.getText());
		}
		}
				

	}


