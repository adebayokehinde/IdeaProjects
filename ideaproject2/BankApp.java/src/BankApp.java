import java.util.Scanner;

public class BankApp {
    static Bank bank = new Bank();

    public BankApp() {
    }

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        switch (input("Welcome to the Bank \n\nwhere is our menu:\n\n1. Create a new account\n2. Deposit\n3. Withdraw\n4. Check Account Balance\n5. Transfer Money\n6. Exit")) {
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> checkBalance();
            case "5" -> transfer();
            case "6" -> exit();
            default -> prompt("Invalid choice.Enter from 1-6");
        }

    }

    public static void exit() {
        prompt("Thank you for using Bank App");
        System.exit(0);
    }

    public static void transfer() {
        try {
            int ownerAccountNumber = Integer.parseInt(input("Enter owner account number: "));
            if (bank.findAccount(ownerAccountNumber) != null) {
                int beneficiary = Integer.parseInt(input("Enter beneficiary number: "));
                if (bank.findAccount(beneficiary) == null) {
                    System.out.println("Account not found");
                    return;
                }

                String password = input("Enter password: ");
                String amountStr = input("Enter Amount: ");
                amountStr = amountStr.replaceAll("[, ]", "");
                if (amountStr.isEmpty()) {
                    throw new IllegalArgumentException("Invalid amount entered.");
                }

                double amount = Double.parseDouble(amountStr);
                bank.transfer(ownerAccountNumber, beneficiary, amount, password);
                return;
            }

            System.out.println("Account not found");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
            return;
        } finally {
            main();
        }

    }

    public static void checkBalance() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            if (bank.findAccount(accountNumber) != null) {
                String password = input("Enter password: ");
                prompt(String.valueOf(bank.getBalance(accountNumber, password)));
                return;
            }

            System.out.println("Account not found");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
            return;
        } finally {
            main();
        }

    }

    public static void withdraw() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            if (bank.findAccount(accountNumber) != null) {
                String amountStr = input("Enter Amount: ");
                amountStr = amountStr.replaceAll("[, ]", "");
                double amount = Double.parseDouble(amountStr);
                String password = input("Enter password: ");
                bank.withdraw(accountNumber, amount, password);
                return;
            }

            System.out.println("Account not found");
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
            prompt("Withdraw failed.");
            return;
        } finally {
            main();
        }

    }

    public static void deposit() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            if (bank.findAccount(accountNumber) != null) {
                String amountStr = input("Enter Amount: ");
                amountStr = amountStr.replaceAll("[, ]", "");
                double amount = Double.parseDouble(amountStr);
                bank.deposit(accountNumber, amount);
                return;
            }

            System.out.println("Account not found");
        } catch (IllegalArgumentException e) {
            prompt("Error: " + e.getMessage());
            return;
        } finally {
            main();
        }

    }

    public static void createAccount() {
        try {
            String firstName = input("Enter first name: ");
            String lastName = input("Enter last name: ");
            String password = input("Enter password: ");
            bank.createAccount(firstName, lastName, password);
        } catch (IllegalArgumentException e) {
            prompt("Error: " + e.getMessage());
        } finally {
            main();
        }

    }

    public static void prompt(String message) {
        System.out.println(message);
    }

    public static String input(String message) {
        prompt(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
