public class Account {
    private String accountNumber;
    private double balance;
    private int pin;

    public Account() {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.pin = Integer.parseInt(String.valueOf(pin));
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;

    }

    public boolean withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean updatepin(String oldpin, String newpin) {


    }
