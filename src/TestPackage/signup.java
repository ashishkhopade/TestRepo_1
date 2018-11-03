package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class signup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Up")).click();
		//fetching dropdownlist items
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
		dropdown.click();
		Thread.sleep(2000);
		Select edition=new Select(dropdown);
		edition.selectByVisibleText("Free Edition");
		driver.findElement(By.name("first_name")).sendKeys("Ashish");
		driver.findElement(By.name("surname")).sendKeys("Khopade");
		driver.findElement(By.name("email")).sendKeys("jeevan.khopade@gmail.com");
		driver.findElement(By.name("email_confirm")).sendKeys("jeevan.khopade@gmail.com");
		driver.findElement(By.name("username")).sendKeys("Ashishk");
		driver.findElement(By.name("password")).sendKeys("mylovetod");
		driver.findElement(By.name("passwordconfirm")).sendKeys("mylovetod");
		WebElement checkbox=driver.findElement(By.name("agreeTerms"));
		//isSelected method to check checkbox state
		System.out.println("The checkbox is selection state is - " + checkbox.isSelected() +"- So please click on checkbox");
		if(checkbox.isSelected()==false) {
		checkbox.click();
		}
		System.out.println("Now checkbox is selection state is - " + checkbox.isSelected());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll down
		js.executeScript("scroll(0,400)");
		driver.findElement(By.id("submitButton")).click();
	 }

}
