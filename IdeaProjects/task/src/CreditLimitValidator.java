import java.util.Scanner;
public class CreditLimitValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountnumber = input.nextInt();

        System.out.print("Enter balance at the beginning of the month: ");
        int beginningbalance = input.nextInt();

        System.out.print("Enter total of all items charged by the customer this month: ");
        int charges = input.nextInt();

        System.out.print("Enter total of all credits applied to the customers's account this month: ");
        int credits = input.nextInt();

        System.out.print("allowed credit limit: ");
        int creditlimit = input.nextInt();

        int newbalance = beginningbalance + charges - credits;
        System.out.print("your new balance is:" + newbalance);

        if(newbalance > creditlimit) {
            System.out.print("Credit limit exceeded");
        }

    }
}