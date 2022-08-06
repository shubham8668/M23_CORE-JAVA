package com.cg.inheritance;
class Super
{
	protected int rollno;
	void print()
	{
System.out.println("hey guys whats going on...?");
	}
}
class subclass extends Super
{
	void accept()
	{
		System.out.println("roll no is:+rollno");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		subclass s=new subclass();
		s.rollno=3;
		s.accept();
		s.print();

	}

}
