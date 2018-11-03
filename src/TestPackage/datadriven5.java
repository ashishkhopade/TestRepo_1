package TestPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class datadriven5 {

	public static void main(String[] args) throws IOException {
		// TO write in text file
		File fc=new File("E:\\selenium\\TestProject\\datadriven2.txt");
		fc.createNewFile();
		FileWriter fw=new FileWriter(fc);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Mayur Chandrashekhar Khopade");
		bw.newLine();
		bw.write("Chandrashekhar Ganpatrao Khopade");
		System.out.println("Updated Successfully");
		bw.close();

	}

}
