package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tryxpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.demo.guru99.com/v1");
		Thread.sleep(3000);
		//basic xpath
		driver.findElement(By.xpath("//input[@name='password']"));
		//contains x path
		driver.findElement(By.xpath("//input[contains(@name,'Login')]"));
		//using and or conditions
		driver.findElement(By.xpath("//input[@name='btnReset' and @value='RESET']"));
		driver.findElement(By.xpath("//input[@name='btnReset' or @value='RESET']"));
		//Starts-with function
		driver.findElement(By.xpath("//label[starts-with(@id, 'message')]"));
		//text() function
		driver.findElement(By.xpath("//label[text()='Password must not be blank']"));
		//following 
		driver.findElement(By.xpath("//input[@name='uid']//following::input[@name='btnLogin']"));
		//ancestor
		driver.findElement(By.xpath("//input[@name='uid']//ancestor::form[1]"));
		//child
		driver.findElement(By.xpath("//form[@name='frmLogin']//child::input[@name='password']"));
		//preceding
		driver.findElement(By.xpath("//input[@name='password']//preceding::input[1]"));
		//following-sibling
		driver.findElement(By.xpath("//form[@name='frmLogin']/table/tbody/tr[2]//following-sibling::label"));
		//parent
		driver.findElement(By.xpath("//td[text()='UserID']//parent::tr//parent::tbody//parent::table//parent::form"));
		//self
		driver.findElement(By.xpath("//input[@name='uid']//self::input[1]"));
		//descendant
		driver.findElement(By.xpath(""));
	}

}
