package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven1 {

	public static void main(String[] args) throws IOException {
		// TO count total cell and total row
		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheet("Family Details");
		int rowcount=s1.getLastRowNum();
		System.out.println("Total rows : "+(rowcount+1));
		//add for loop to print row value-----assignment
		int cellcount=s1.getRow(1).getLastCellNum();
		System.out.println("Total columns : "+cellcount);
		Row R1=s1.getRow(2);
		//to print cell values
		for(int i=0; i<=cellcount-1; i++)
		{
			System.out.print(R1.getCell(i).getStringCellValue()+"\t");
		}
			
		

	}

}
