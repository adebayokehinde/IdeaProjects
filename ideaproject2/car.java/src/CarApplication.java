public class CarApplication {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota Corolla", "2020", 20000.00);
        Car car2 = new Car("Honda Civic", "2019", 18000.00);


        System.out.printf("Car 1 (%s %s) initial price: $%.2f%n", car1.getmodel(), car1.getYear(), car1.getPrice());
        System.out.printf("Car 2 (%s %s) initial price: $%.2f%n%n", car2.getmodel(), car2.getYear(), car2.getPrice());


        car1.applyDiscount(5.0); // 5% discount on the first car
        car2.applyDiscount(7.0); // 7% discount on the second car


        System.out.printf("Car 1 (%s %s) price after 5%% discount: $%.2f%n", car1.getmodel(), car1.getYear(), car1.getPrice());
        System.out.printf("Car 2 (%s %s) price after 7%% discount: $%.2f%n", car2.getmodel(), car2.getYear(), car2.getPrice());
    }
}
