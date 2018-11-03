package TestPackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class htmltoexcelnew {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\softwear\\gecko_driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(3000);

		//String before_strxpath="//table[@class='tsc_table_s13']/tbody/tr";
		List<WebElement> rowsize=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		int rowcount=rowsize.size();

		for(int i=1; i<=rowcount; i++) {
			String Structure=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+i+"]/th[1]")).getText();
			System.out.println(Structure);
			setDataInExcelfile(Structure, "E:\\selenium\\TestProject\\Book1.xlsx", "Sheet1", i, 0);
		}
		driver.close();
	}

	public static void setDataInExcelfile(String value, String filepath, String sheetName, int rowNo, int cellNo) throws IOException {

		FileInputStream fis = new FileInputStream("E:\\selenium\\TestProject\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		if(row == null){
			row = sheet.createRow(rowNo);
		}
		Cell cell = row.createCell(cellNo);
		cell.setCellValue(value);
		fis.close();
		FileOutputStream fos = new FileOutputStream("E:\\selenium\\TestProject\\Book1.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();  
		System.out.println("Excel file is updated.");
	}

}

