package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class htmltoexl1 {
	public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(3000);
		/*List<WebElement> thvalues=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
		for(WebElement structure: thvalues) {
			System.out.println(structure.getText());*/
			File f1= new File("E:\\selenium\\TestProject\\datadriven1.xls");
			//create fileinputstream object for the file
			FileInputStream fis= new FileInputStream(f1);
			Workbook wb= WorkbookFactory.create(fis);
			Sheet s1=wb.getSheet("Family Details");
			s1.getRow(1).getCell(0).setCellValue("Mayur");
			FileOutputStream fos=new FileOutputStream(f1);
			wb.write(fos);
			fos.close();
		}
	}


