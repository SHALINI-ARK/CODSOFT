import java.util.*;
public class ATM {
	Scanner sc = new Scanner(System.in);
	 public Bank bankAccount;
	    public ATM(Bank bankAccount) {
	        this.bankAccount = bankAccount;
	    }
	    public void withdraw(){
	        System.out.println("Enter the amount to withdraw: ");
	        int amount = sc.nextInt();
	        withdraw(amount);
	    }
	    public void deposit() {
	        System.out.println("Enter the amount to deposit: ");
	        int amount = sc.nextInt();
	        deposit(amount);
	    }
	    private void withdraw(int amt) {
	        if (bankAccount.getBalance() < amt) {
	            System.out.println("Insufficient funds");
	        }
	        else
	        {
	        bankAccount.withdraw(amt);
	        System.out.println("Amount Withdraw Sucessfully "+amt);
	        }
	    }
	    private void deposit(int amt) {
	        bankAccount.deposit(amt);
	        System.out.println("Amount Deposited Sucessfully "+amt);
	    }
	    public void checkBalance() {
	        System.out.println("Your account balance is: "+bankAccount.getBalance());
	    }
	    public static void main(String [] args) {
	 	   Bank bAccount = new Bank(2500);
	        ATM atm = new ATM(bAccount);
	        int choice;
	        Scanner scanner = new Scanner(System.in);
	        do
	        {
	        System.out.println("ATM Menu"+"\n1. Withdraw"+"\n2. Deposit"+"\n3. Check Balance"+"\n4. Exit");
	        System.out.println("Please, enter your choice: ");
	        choice = scanner.nextInt();
	        switch (choice) {
	            case 1:
	            	atm.withdraw();
	                break;
	            case 2:
	            	atm.deposit();
	                break;
	            case 3:
	            	atm.checkBalance();
	                break;
	            case 4:
	                break;
	            default:
	                System.out.println("Invalid choice");
	        	}
	        }while(choice!=4);
	        System.out.println("Thanks for using our ATM...!");
	        scanner.close();
	    }
}
