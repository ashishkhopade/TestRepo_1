package TestPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class datadriven4 {

	public static void main(String[] args) throws IOException {
		// TO read from normal text
		File f1=new File("E:\\\\selenium\\\\TestProject\\datadriventxt.txt");
		f1.createNewFile();
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		System.out.println(str);
		
		

	}

}
