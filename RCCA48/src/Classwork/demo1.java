package Classwork;

import java.util.Arrays;

public class demo1 {

	public static void main(String[] args) 
	{
		String[] arr = {"hi","helo","bye","hi"};
		int x=0;
		String[] ans=new String[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<ans.length;j++)
			{
				if(arr[i]!=arr[j])
				{
					ans[x++]=arr[j];
				}
			}
		}
		for (int i = 0; i < ans.length; i++) 
		{
			System.out.println(ans[i]);
			
		}
		
	}
}
