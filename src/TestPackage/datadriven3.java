package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven3 {

	public static void main(String[] args) throws IOException {
		// TO update cell value
		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheet("Sheet1");
		s1.getRow(1).getCell(0).setCellValue("Mayur");
		FileOutputStream fos=new FileOutputStream(f1);
		wb.write(fos);
		fos.close();
		System.out.println("Excel Updated Successfully");
		

	}

}
