public class BankAccount {
    private String ownerName;
    private double balance;


    // Constructor
    public BankAccount(String ownerName, double initialBalance){
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited. New Balance is:" + balance);
        } else {
            System.out.println("Invalid amount, please enter the amount correctly.");
        }
    }

    // Withdraw money
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Suceffuly withdrawn, new balance :" + balance);
        } else {
            System.out.println("insufficient funds or wrong format");
        }
    }

    // Getter methods for balance
    public double getBalance() {
        return balance;
    }

    // Getter method for owner name
    public String getOwnerName() {
        return ownerName;
    }

}

