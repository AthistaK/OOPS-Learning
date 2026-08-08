class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Athista";
        account.accountNumber = 1001;
        account.balance = 5000;

        account.deposit(2000);
        account.withdraw(1500);

        account.displayDetails();
    }
}