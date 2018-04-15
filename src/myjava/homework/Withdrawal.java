// Represents a withdrawal ATM transaction
package myjava.homework;

public class Withdrawal extends Transaction{

	/* Fill your code here */
    public Withdrawal(int theaccount){ super(theaccount); }
    public void execute(BankDatabase theBankDatabase){
        Screen screen = new Screen();
        Keypad keypad = new Keypad();
        int money;
        screen.displayMessageLine("How much you want to withdraw?");
        money = keypad.getInput();
        money = theBankDatabase.getTotalBalance(this.getAccountNumber())  - money;
        if(money>=0){
            theBankDatabase.setTotalBalance(this.getAccountNumber(),money);
            screen.displayMessageLine("Transaction succuss");
        }
        else{
            screen.displayMessageLine("Transaction Failed, you don't have that much of money");
        }

    }
}
