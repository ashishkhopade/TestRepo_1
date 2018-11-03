package TestPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToGetPropertyName {

	public static void main(String[] args) throws IOException {
		// object repository using properties
		Properties p1=new Properties();
		FileInputStream fis= new FileInputStream("E:\\selenium\\TestProject\\src\\TestPackage\\Object.properties");
		p1.load(fis);
		String Fname=p1.getProperty("Fname");
		String Mname=p1.getProperty("Mname");
		String Lname=p1.getProperty("Lname");
		System.out.print(Fname+"\t"+Mname+"\t"+Lname);
	}

}

