import java.util.Scanner;
public class EnforcingPrivacy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer");
        int number = input.nextInt();

        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < 4; i++) {
            digits[i] = (digits[i] + 7) % 10;
        }
        int temp = digits[0];
    }
}
