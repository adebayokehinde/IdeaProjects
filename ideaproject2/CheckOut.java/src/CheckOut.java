import java.util.Scanner;
import java.time.LocalDateTime;
public class CheckOut {

    public static void main(String[] args) {
        printReceipt();
    }

    public static void printReceipt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer's name: ");
        String customerName = scanner.nextLine();

        String receipt = "";
        double grandTotal = 0.0;
        String addMore;

        System.out.println("What did the customer buy? ");
        String itemName = scanner.nextLine();

        System.out.println("How many pieces? ");
        int quantity = scanner.nextInt();

        System.out.print("How much per unit? ");
        double unitPrice = scanner.nextDouble();

        double totalPrice = quantity * unitPrice;
        grandTotal += totalPrice;

        receipt += itemName + "\t\t" + quantity + "\t\t" + unitPrice + "\t\t" + totalPrice + "\n";

        scanner.nextLine();

        System.out.println("Add more items? (yes/no): ");
        addMore = scanner.nextLine();

        while (addMore.equalsIgnoreCase("yes")) {
            System.out.println("What did the customer buy? ");
            itemName = scanner.nextLine();

            System.out.println("How many pieces? ");
            quantity = scanner.nextInt();

            System.out.print("How much per unit? ");
            unitPrice = scanner.nextDouble();

            totalPrice = quantity * unitPrice;
            grandTotal += totalPrice;

            receipt += itemName + "\t\t" + quantity + "\t\t" + unitPrice + "\t\t" + totalPrice + "\n";

            scanner.nextLine();

            System.out.println("Add more items? (yes/no): ");
            addMore = scanner.nextLine();
        }

        System.out.println("What is your name?");
        String cashierName = scanner.nextLine();

        System.out.println("How much discount will the customer get?");
        double discount = scanner.nextDouble();
        LocalDateTime date = LocalDateTime.now();
        double vatRate = 0.1750;
        double vateTotal = grandTotal * vatRate;
        double billTotal = (grandTotal - discount) * vatRate;
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 83293828343");
        System.out.println("Date: " + date);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("============================================================");
        System.out.println(receipt);
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tGrand Total: " + "\t\t\t" + grandTotal);
        System.out.println("\t\tDiscount: " + "\t\t\t" + discount);
        System.out.println("\t\tVAT @ 17.50%:" + "\t\t\t" + vateTotal);
        System.out.println("============================================================");
        System.out.println("\t\tBill Total:" + "\t\t\t" + billTotal);
        System.out.println("============================================================");
        System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + billTotal);
        System.out.println("============================================================");

        System.out.println("How much did the customer give to you?");
        double paided = scanner.nextDouble();

        double balance = paided - billTotal;
        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 83293828343");
        System.out.println("Date: " + date);
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("\nITEM\t\tQTY\t\tPRICE\t\tTOTAL(NGN)");
        System.out.println("============================================================");
        System.out.println(receipt);
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\tGrand Total: " + "\t\t\t" + grandTotal);
        System.out.println("\t\tDiscount: " + "\t\t\t" + discount);
        System.out.println("\t\tVAT @ 17.50%:" + "\t\t\t" + vateTotal);
        System.out.println("============================================================");
        System.out.println("\t\tBill Total:" + "\t\t\t" + billTotal);
        System.out.println("\t\tAmount paid:" + "\t\t\t" + paided);
        System.out.println("\t\tBalance:" + "\t\t\t" + balance);
        System.out.println("============================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("============================================================");

    }
}
