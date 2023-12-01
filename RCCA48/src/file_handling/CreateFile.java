package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException 
	{
		File f1 =new File("d://Roni_Patil//yogi.txt");
		
				
		if(f1.createNewFile())
		{
			System.out.println("file is created");
		}
		
		
	}

}
