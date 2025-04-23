import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName() + " - " + quantity + " pcs - " + getTotalPrice();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CheckoutSystem {
    private List<CartItem> cart = new ArrayList<>();
    private double discountRate;
    private final double VAT_RATE = 0.075;

    public void addProductToCart(Product product, int quantity) {
        cart.add(new CartItem(product, quantity));
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void displayInvoice(String customerName, String cashierName) {
        System.out.println("SEMICOLON STORES* MAIN BRANCH LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Cashier: " + cashierName);
        System.out.println("\nITEM QTY PRICE TOTAL (NGN)");
        for (CartItem item : cart) {
            System.out.println(item.getProduct().getName() + " " + item.getQuantity() + " " + item.getProduct().getPrice() + " " + item.getTotalPrice());
        }

        double subTotal = calculateSubTotal();
        double discount = subTotal * (discountRate / 100);
        double vat = subTotal * VAT_RATE;
        double total = subTotal - discount + vat;

        System.out.println("Sub Total: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT @ 7.5%: " + vat);
        System.out.println("Bill Total: " + total);
    }

    double calculateSubTotal() {
        double subTotal = 0;
        for (CartItem item : cart) {
            subTotal += item.getTotalPrice();
        }
        return subTotal;
    }
}
public class SemicolonStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckoutSystem checkoutSystem = new CheckoutSystem();

        System.out.print("What is the customer's Name: ");
        String customerName = scanner.nextLine();

        boolean addMoreItems = true;
        while (addMoreItems) {
            System.out.print("What did the user buy? ");
            String productName = scanner.nextLine();
            System.out.print("How many pieces? ");
            int quantity = scanner.nextInt();
            System.out.print("How much per unit? ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume the newline

            Product product = new Product(productName, price);
            checkoutSystem.addProductToCart(product, quantity);

            System.out.print("Add more Items? (yes/no): ");
            addMoreItems = scanner.nextLine().equalsIgnoreCase("yes");
        }

        System.out.print("What is your name? ");
        String cashierName = scanner.nextLine();

        System.out.print("How much discount will they get? ");
        double discountRate = scanner.nextDouble();
        checkoutSystem.setDiscountRate(discountRate);

        checkoutSystem.displayInvoice(customerName, cashierName);

        System.out.print("How much did the customer give to you? ");
        double amountPaid = scanner.nextDouble();
        double total = checkoutSystem.calculateSubTotal() * (1 - discountRate / 100) * (1 + 0.075);
        double balance = amountPaid - total;

        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + balance);
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
    }
}

