// Represents a withdrawal ATM transaction
package myjava.homework;
public class Loan extends Transaction{

	/* Fill your code here */
    public Loan(int theaccount){ super(theaccount); }
    public void execute(BankDatabase theBankDatabase){
        Screen screen = new Screen();
        Keypad keypad = new Keypad();
        int money, limit = 0;
        char ch = theBankDatabase.getCreditLevel(this.getAccountNumber());
        if(ch == 'A')limit = 11000;
        else if(ch == 'B')limit = 9000;
        else if(ch == 'C')limit = 7000;
        else if(ch == 'D')limit = 5000;
        limit = limit - theBankDatabase.getDeb(this.getAccountNumber());
        screen.displayMessageLine("your loan :" + theBankDatabase.getDeb(this.getAccountNumber()));
        screen.displayMessageLine("your loan limit is :" + limit + "How much do you want to loan: ");
        money = keypad.getInput();


        if(money <= limit){
            money = money + theBankDatabase.getDeb(this.getAccountNumber());
            theBankDatabase.setDebt(this.getAccountNumber(),money);
            screen.displayMessageLine("Transaction Success");
        }
        else{
            System.out.println(money);
            System.out.println(limit);
            screen.displayMessageLine("Transaction Error, you dont have that much limit!");
        }

    }
}
