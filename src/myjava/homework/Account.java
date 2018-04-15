//Represents a bank account
package myjava.homework;
public class Account {
	
	/* Fill your code here */
	private int accountNumber;
	private int pin;
	private int totalBalance;
	private int debt;
	private char creditLevel;

	public Account(int new_accountNumber, int new_pin, int new_totalBalance, int new_debt, char new_creditLevel){
	    this.accountNumber= new_accountNumber;
	    this.pin = new_pin;
	    this.creditLevel = new_creditLevel;
	    this.totalBalance = new_totalBalance;
	    this.debt = new_debt;
    }
    public boolean validatePIN(int thePin){
	    /*System.out.println(thePin);
        System.out.println(pin);*/
        return thePin == pin;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getTotalBalance(){
        return totalBalance;
	}
    public char getCreditLevel(){
        return creditLevel;
    }
    public int getDebt(){
        return debt;
    }
    public void setTotalBalance(int theBalance){
        totalBalance = theBalance;
    }
    public void setDebt(int theDebt){
        debt = theDebt;
    }
	
}
