package com.capgemini.oops;
import java.util.Scanner;
// demo on how to use class and object

class car
{
	int a;
	void print(int b)
	{
		System.out.println("welcome to m23 batch");
	}
	}
public class classobject{
	

	public static void main(String[] args) {
		car obj=new car();
		//obj.a=55;
		//obj.print();
		Scanner sc=new Scanner (System.in);
		int b=sc.nextInt();
		obj.print(b);
		sc.close();
		
	}

}
