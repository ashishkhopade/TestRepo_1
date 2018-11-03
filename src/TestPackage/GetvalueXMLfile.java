package TestPackage;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class GetvalueXMLfile {

	public static void main(String[] args) throws DocumentException {
		// object repository using xml file
		File InputFile=new File("E:\\selenium\\TestProject\\src\\TestPackage\\Object1.xml");
		SAXReader s=new SAXReader();
		Document d=s.read(InputFile);
		String fstr=d.selectSingleNode("//menu/Fname").getText();
		String mstr=d.selectSingleNode("//menu/Mname").getText();
		String lstr=d.selectSingleNode("//menu/Lname").getText();
		System.out.print(fstr+"\t"+mstr+"\t"+lstr);

	}

}
