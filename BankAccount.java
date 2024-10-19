import java.util.Scanner;
// Abstract class for Bank Account defining the operations
abstract class ATM {
    public abstract void withDraw(double withdawalamount);
    public abstract void deposit(double depositamount);
    public abstract void checkBalance();
    public abstract void cancel();
    public abstract void OK();
}
// this is inheritance
class SimpleATM extends ATM {

    private double balance = 12000.34;

    // Implement withdraw method
    public void withDraw(double withdrawalamount) {
		if(withdrawalamount > balance) {
			System.out.println("Insufficient balance");
		} else {
	            balance -= withdrawalamount; 
	            System.out.println("You withdrew: $" + withdrawalamount);
	            System.out.println("New balance: $" + balance);
                System.out.println("OK");
		}
	}

    // Implement deposit method
    public void deposit(double depositamount) {
        balance += depositamount;
        System.out.println("You deposited: $" + depositamount);
        System.out.println("New balance: $" + balance);
        System.out.println("Thank you for depositing!");
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // cancelling the transaction
    public void cancel() {
        System.out.println("Transaction cancelled");
    }

    // 'OK' method
    public void OK() {
        System.out.println("Thank you for choosing us!");
    }
}

public static void main(String[] args) {
    // user input
    Scanner scanner = new Scanner(System.in);

    SimpleATM atm = new SimpleATM();

    boolean atmRunning = true;

    // ask for the user input
    while (atmRunning) {
    System.out.println("Choose a transaction:");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Check Balance");
    System.out.println("4. OK");
    System.out.println("5. Cancel");

    int option = scanner.nextInt();

    switch (option) {
        // handling the cases
        case 1:
            System.out.println("Enter the amount to withdraw: ");
            double withdawalamount = scanner.nextDouble();
            atm.withDraw(withdawalamount);
            break;

        case 2:
            System.out.println("Enter amount to deposit: ");
            double depositamount = scanner.nextDouble();
            atm.deposit(depositamount);
            break;

        case 3:
            atm.checkBalance();
            break;
        
        case 4:
            atm.OK();
            break;
        case 5:
            atm.cancel();
            atmRunning = false;    
            break;

        default:
        System.out.println("Invalid option. Please try again.");
    }
}
scanner.close();
}

