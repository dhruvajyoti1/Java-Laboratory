class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;


    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Transaction Failed! Insufficient Balance. Current Balance: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | New Balance: ₹" + balance);
        }
    }


    public double getBalance() {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Alice", 5000);

        acc1.displayAccountInfo();

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.withdraw(7000);
        acc1.deposit(-500);

        System.out.println("Final Balance: ₹" + acc1.getBalance());
    }
}

