package file_handling;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.Writer;

public class Buffedddd {

	public static void main(String[] args) throws IOException 
	{
		File f1 =new File("d://Roni_Patil//yogi.txt");
		Writer fw =new FileWriter(f1);
		BufferedWriter br=new BufferedWriter(fw);
		br.write("bartiya");
		br.newLine();
		br.write("Yak barthiya");
		br.newLine();
		br.write("barala");
		br.flush();
		System.out.println("file is written");
		
		
	}

}
