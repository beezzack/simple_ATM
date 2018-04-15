// Represents the bank account information database
package myjava.homework;
public class BankDatabase {
	
	private Account[] accounts; // array of Accounts
	
    // no-argument BankDatabase constructor initializes accounts
	public BankDatabase () {
		accounts = new Account[4];  // just 4 accounts for testing
		accounts[0] = new Account(111, 222, 5000,0,'A');
		accounts[1] = new Account(222, 333, 4000,0,'B');
		accounts[2] = new Account(333, 444, 3000,0,'C');
		accounts[3] = new Account(444, 555, 2000,0,'D');
	}
	
	/* Fill your code here */
	public boolean authentivcateUser(int tmpAcc,int tmpPin){
        for (Account account:accounts
             ) {
            /*System.out.println(account.getAccountNumber());
            System.out.println(tmpPin);*/
            if (account.getAccountNumber() == tmpAcc ){
                /*System.out.println("Hi");*/
                if(account.validatePIN(tmpPin)){
                    /*System.out.println("Oh");*/
                    return true;
                }
            }
        }
        return false;
	}
	public int getTotalBalance(int theAccount){
        for (Account account:accounts
                ) {
            if(account.getAccountNumber() == theAccount)
                return account.getTotalBalance();
        }
        return -1;
	}
	public char getCreditLevel(int theAccount){
        for (Account account:accounts
                ) {
            if (account.getAccountNumber() == theAccount ){
                return account.getCreditLevel();
            }
        }
        return 'F';
	}
	public int getDeb(int theAccount){
        for (Account account:accounts
                ) {
            if (account.getAccountNumber() == theAccount ){
                return account.getDebt();
            }
        }
        return -1;
	}
	public void setTotalBalance(int theAccount, int theTotalBalance){
        for (Account account:accounts
                ) {
            if (account.getAccountNumber() == theAccount ){
                account.setTotalBalance(theTotalBalance);
            }
        }
	}
	public void setDebt(int theAccount, int themoney){
        for (Account account:accounts
                ) {
            if (account.getAccountNumber() == theAccount ){
                account.setDebt(themoney);
            }
        }

	}
	
}
