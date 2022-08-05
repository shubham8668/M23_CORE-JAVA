package com.cg.package4;
class car
{
	protected void print()
	{
		System.out.println("i am using print method");
	}
}
class mercedss extends car
{
	
}
public class ProtectedExample {

	public static void main(String[] args) {
		mercedss m=new mercedss();
		m.print();
	}

}
