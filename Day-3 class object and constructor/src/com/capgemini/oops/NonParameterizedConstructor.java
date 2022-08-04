package com.capgemini.oops;
class animal
{
	int a;
	animal()
	{
		a=15;
	}
	void display()
	{
		System.out.println(a);
	}

public  class NonParameterizedConstructor {

	public void main(String[] args) {
		animal obj=new animal();
		obj.display();
	}
}
}
	


