package client;

import application.MMCurrentAcc;
import application.MMSavingAcc;

import framework.CurrentAcc;
import framework.SavingAcc;

public class Client 
{
	public static void main(String[] args)
	{
	
	//here minimum account balance limit is 500 
	SavingAcc   ms= new MMSavingAcc(1001,"shubham",800, true);
	
	//current limit is 2500 
	CurrentAcc mc= new MMCurrentAcc(1002,"ashu",5000,2500);
	
	
	System.out.println("Saving Account : ");
	ms.withdraw(900);
	
	System.out.println("Current Account : ");
	mc.withdraw(3000);
	
	
	}
	
}