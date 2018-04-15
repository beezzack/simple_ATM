package myjava.homework;
// Abstract superclass Transaction represents an ATM transaction

public abstract class Transaction {

    private int accountNumber;

    public Transaction(int theaccount){
        accountNumber = theaccount;
    }


	/* Fill your code here */
	public int getAccountNumber(){
        return accountNumber;
    }

    public abstract void execute(BankDatabase theBankDatabase);
	
}
