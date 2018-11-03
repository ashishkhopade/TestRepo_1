package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven6 {
	public static void main(String[] args) throws IOException {
		// TO count total cell and total row
		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheet("Family Details");
		int rowcount=s1.getLastRowNum();
		System.out.println("Total Rows : "+rowcount);
		//add for loop to print row value-----assignment
		int cellcount=s1.getRow(1).getLastCellNum();
		System.out.println("Total Columns : "+cellcount);
		//Row R1=s1.getRow(2);
		//to print cell values
		for(int i=0; i<=rowcount; i++)
		{
			for(int j=0; j<=cellcount-1; j++)
			{
			System.out.print(s1.getRow(i).getCell(j).getStringCellValue()+"\t");
				//System.out.print(s1.getRow(i).getCell(j).getNumericCellValue()+"\t");
			}
			System.out.println();
		}
			
		

	}

}
