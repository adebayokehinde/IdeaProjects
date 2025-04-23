import bankapp.string;

public class Account {
    private String accountNumber;
    private double balance;
    private string pin;

    public Account(String accountNumber, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.pin = pin;
    }
    public String getAccountNumber() {
        return accountNumber;

    }


}