import java.util.Scanner;
public class GasMillage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        while (true) {
            System.out.println("Enter miles driven (-1 to quit): ");
            int miles = input.nextInt();
            if (miles == -1) {
                break;
            }
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            int milesPerGallon =  miles / gallons;
            System.out.print("Miles per gallon for this trip is: " + milesPerGallon);


            totalMiles += miles;
            totalGallons += gallons;
            if (totalGallons != 0) {
                int combinedMilesPerGallon =  totalMiles / totalGallons;
                System.out.printf("Combined miles per gallon for all trips is : "+ combinedMilesPerGallon);
            }

        }

    }
}