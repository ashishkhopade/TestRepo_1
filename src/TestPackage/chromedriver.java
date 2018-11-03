package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\softwear\\chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	}

}
