package application;

import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc ms=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
				return ms;
		
	}
	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		 MMCurrentAcc mc=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mc;
	}

}