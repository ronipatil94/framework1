package Encapsulation;

class Student 
{
	private char Grade='a';
	public char getGrade()
	{
		return Grade;
	}
	public void setGrade(char Grade)
	{
		this.Grade=Grade;	
	}

}
public class Main_std
{
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println(s.getGrade());
		s.setGrade('b');
		System.out.println(s.getGrade());
}
}
