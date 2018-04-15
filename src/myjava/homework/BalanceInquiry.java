// Represents a balance inquiry ATM transaction
package myjava.homework;
public class BalanceInquiry extends Transaction{

	/* Fill your code here */
	public BalanceInquiry(int theaccount){ super(theaccount); }

    public void execute(BankDatabase theBankDatabase){
        Screen screen = new Screen();
        screen.displayMessageLine("Balance information");
        screen.displayMessageLine("Total Balance : " + theBankDatabase.getTotalBalance(this.getAccountNumber()));
    }
}
