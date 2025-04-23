import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weeklyEarning = 200;
        double percentageRate = 0.09;
        double totalSales = 0.0;
        double itemPrice;
        while (true) {
            System.out.println("Enter the prices of the items sold by the salesperson (enter -1 to finish):");


            System.out.print("Enter item price: ");
            itemPrice = input.nextDouble();


            totalSales += itemPrice;


            double earnings = weeklyEarning + (percentageRate * totalSales);

            System.out.printf("The salesperson's earnings for the week is:" + earnings);
        }
    }
}
