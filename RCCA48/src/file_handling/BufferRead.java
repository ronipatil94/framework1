package file_handling;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

public class BufferRead {

	public static void main(String[] args) throws Exception 
	{
		File f1 =new File("d://Roni_Patil//yogi.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		br.read(br);
		
		
		

	}

}
