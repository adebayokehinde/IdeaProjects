import java.util.Scanner;
public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int largest = 0;
        int secondlargest = 0;

        while (counter <= 10) {
            System.out.print("Enter Number");
            int number = input.nextInt();

            if (number > largest) {
                secondlargest = largest;
                largest = number;
//            } else if (number > secondlargest) {
//                secondlargest = number;
            }

            counter++;
        }
        System.out.print("The largest number is: " + largest);
        System.out.println("The second largest is:" + secondlargest);
    }
}

