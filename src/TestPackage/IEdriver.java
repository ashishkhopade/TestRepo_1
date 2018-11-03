package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\softwear\\IE_driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();


	}

}
