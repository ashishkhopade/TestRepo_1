package TestPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WinAuthautoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Runtime.getRuntime().exec("E:\\AutoITScript\\handlewindowsauthentication.exe");
		driver.get("http://www.engprod-charter.net");
		Thread.sleep(3000);

	}

}
