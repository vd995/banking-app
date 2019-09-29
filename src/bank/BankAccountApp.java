package bank;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\Win7\\Desktop\\NewBankAccounts.csv";
		// TODO Auto-generated method stub
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "123456789", 1500);
		
		Savings saveacc1 = new Savings("Rich Lowe", "123456555", 2500);
		
		saveacc1.showInfo();
		
		System.out.println("**************");
		
		
		chkacc1.showInfo();
		
		saveacc1.compound();
		*/
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			// System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			if (accountType.equals("Savings")) {
				
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACC TYPE");
			}
		}
		
		
		for (Account acc : accounts) {
			System.out.println("\n*******************");
			acc.showInfo();
		}
		
		
	}

}
