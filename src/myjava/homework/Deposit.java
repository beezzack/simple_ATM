// Represents a deposit ATM transaction
package myjava.homework;
public class Deposit extends Transaction{
	
	/* Fill your code here */
    public Deposit(int theaccount){ super(theaccount); }
	public void execute(BankDatabase theBankDatabase){
        Screen screen = new Screen();
        Keypad keypad = new Keypad();
        int money;
        screen.displayMessageLine("How much you want to deposit?");
        money = keypad.getInput();
        money = theBankDatabase.getTotalBalance(this.getAccountNumber()) + money;
        theBankDatabase.setTotalBalance(this.getAccountNumber(),money);
        screen.displayMessageLine("Transaction succuss");
    }

}
