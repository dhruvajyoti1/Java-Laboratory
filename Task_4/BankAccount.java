class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }

    void displayBalance() {
        System.out.println(accountHolder + " Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya", 5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(5000); // overdraft attempt
    }
}
