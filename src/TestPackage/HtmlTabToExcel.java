package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HtmlTabToExcel {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("http://toolsqa.com/automation-practice-table/");
			Thread.sleep(3000);
			//table[@class='tsc_table_s13']/tbody/tr[1]/th
			String before_strxpath="//table[@class='tsc_table_s13']/tbody/tr[";
			String after_strxpath="]";
			List<WebElement> row=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
			int rowcount=row.size();
			
			for(int i=1; i<=rowcount; i++) {
				String actualxpath_str=before_strxpath+i+after_strxpath;
				String Structure=driver.findElement(By.xpath(actualxpath_str)).getText();
				System.out.println(Structure);
				File f1=new File("E:\\selenium\\TestProject\\datadriven1.xlsx");
				FileInputStream fis= new FileInputStream(f1);
				XSSFWorkbook wb= new XSSFWorkbook(fis);
				XSSFSheet s1=wb.getSheet("Family Details");
				FileOutputStream fos=new FileOutputStream(f1);
				s1.getRow(i).getCell(0).setCellValue(Structure);
				wb.write(fos);
			}
			

	}

}
