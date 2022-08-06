package com.cg.inheritance;
class bike
{
	protected int speed;
	void display() {
		System.out.println("i like to drive a bike");
	}
}
class pulser extends bike
{
	protected String color;
	void print() 
	{
		System.out.println("speed is:"+speed);
	}
}
class pulser150 extends pulser
{
	
	void accept() 
	{
		System.out.println("color is:"+color);
	}
	
	}


public class MultilevelInheritance {

	public static void main(String[] args) {
		pulser150 p=new pulser150();
		p.color="black";
		p.speed=60;
		p.accept();
		p.display();
		p.print();
		
		
		
		

	}

}
