public class Bank {
  private int balance;
	    public Bank(int balance) {
        this.balance = balance;
      }
  public void withdraw(int amt){
        if (balance < amt) {
          System.out.println("Insufficient fund");
        }
	        balance -= amt;
	    }
	    public void deposit(int amt) {
	        balance += amt;
	    }
	    public int getBalance() {
	        return balance;
	    }
}
