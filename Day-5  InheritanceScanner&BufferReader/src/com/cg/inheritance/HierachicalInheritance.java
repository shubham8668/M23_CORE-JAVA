package com.cg.inheritance;
class AndroidVersion
{
	void display()
	{
		System.out.println("Android-version");
	}
}
class kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Android-Version");
	}
}
class pie extends AndroidVersion
{
	void print()
	{
		System.out.println("pie");
	}
}

public class HierachicalInheritance {

	public static void main(String[] args) {
		kitkat k=new kitkat();

	}

}
