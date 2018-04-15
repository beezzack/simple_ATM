package myjava.homework;
import java.util.Scanner;
public class ATM {

	/* Fill your code here */
	private boolean userAuthenticated(){
        return true;
	}
	public BankDatabase bankDatabase(){
        return new BankDatabase();
    }

    public void run(){
        bankDatabase();
        Screen screen= new Screen();
        Keypad keypad = new Keypad();
        while(true){
            int tmpAcc, tmpPin, tmpOption;
            boolean flag = false;
            BankDatabase newBankDatabase = bankDatabase();
            screen.displayMessage("Wellcome!");
            screen.displayMessage("Please enter your account number : ");
            tmpAcc = keypad.getInput();
            screen.displayMessage("Please enter your Pin number : ");
            tmpPin = keypad.getInput();
            if(newBankDatabase.authentivcateUser(tmpAcc, tmpPin) == true){
                flag = userAuthenticated();
            }

            if(flag){
                while (true){
                    screen.displayMessageLine("Main_menu :");
                    screen.displayMessageLine("1. View my balance");
                    screen.displayMessageLine("2. Withdraw");
                    screen.displayMessageLine("3. Deposit");
                    screen.displayMessageLine("4. Loan");
                    screen.displayMessageLine("5. Exit");
                    tmpOption = keypad.getInput();
                    if(tmpOption == 5){
                        screen.displayMessageLine("88");
                        break;
                    }
                    else if(tmpOption == 1){
                        BalanceInquiry balanceInquiry = new BalanceInquiry(tmpAcc);
                        balanceInquiry.execute(newBankDatabase);
                    }
                    else if(tmpOption == 2){
                        Withdrawal withdrawal = new Withdrawal(tmpAcc);
                        withdrawal.execute(newBankDatabase);
                    }
                    else if(tmpOption == 3){
                        Deposit deposit = new Deposit(tmpAcc);
                        deposit.execute(newBankDatabase);
                    }
                    else if(tmpOption == 4){
                        Loan loan = new Loan(tmpAcc);
                        loan.execute(newBankDatabase);
                    }
                    else{
                        screen.displayMessageLine("option error");
                    }
                }

            }
            else{
                screen.displayMessageLine("AccountNumber or Pin Error");
            }
        }

    }
}
