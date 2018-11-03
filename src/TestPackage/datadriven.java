package TestPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;

public class datadriven {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// TO get value from excel
//		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
//		FileInputStream fis= new FileInputStream(f1);
//		XSSFWorkbook wb= new XSSFWorkbook(fis);
//		XSSFSheet s1=wb.getSheet("Sheet1");
//		XSSFRow r1=s1.getRow(1);
//		XSSFCell c1=r1.getCell(0);
//		System.out.println(c1.getStringCellValue());
//		
		//creating object of file/fetch file
		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
		//create fileinputstream object for the file
		FileInputStream fis= new FileInputStream(f1);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("Family Details");
		Row r1=s1.getRow(2);
		Cell c1=r1.getCell(0);
		Cell c2=r1.getCell(1);
		Cell c3=r1.getCell(2);
		System.out.println(c1.getStringCellValue()+"\t"+c2.getStringCellValue()+"\t"+c3.getStringCellValue());


	}

}
