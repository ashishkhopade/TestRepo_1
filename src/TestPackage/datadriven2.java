package TestPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven2 {

	public static void main(String[] args) throws IOException {
		// to get all column name
		File f1= new File("E:\\selenium\\TestProject\\datadriven.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		int SheetSize=wb.getNumberOfSheets();
		System.out.println(SheetSize);
		for(int i=0; i<=SheetSize-1; i++)
		{
			System.out.println(wb.getSheetName(i));
		}

	}

}
