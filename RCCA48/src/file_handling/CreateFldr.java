package file_handling;

import java.io.File;

public class CreateFldr {

	public static void main(String[] args) 
	{
		File f1 =new File("d://Roni_Patil//yogi.txt");
		
		if(f1.mkdirs())
		{
			System.out.println("Folder is created");
		}
		else
		{
			System.out.println("Folder is not created");
		}
		if(f1.exists())
		{
			System.out.println("Folder is present");
		}
		else
		{
			System.out.println("Folder is not present");
		}
		
		if(f1.delete())
		{
			System.out.println("Folder is deleted");
		}
		else
		{
			System.out.println("Folder is not deleted");
		}
		

	}

}
