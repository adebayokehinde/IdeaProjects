public class Car {
    private String model;
    private String year;
    public double price;

    public Car(String model, String year, double price) {
    	this.model = model;
	    this.year = year;
	    this.price = price;
}
String getmodel(){
    return model;

}
public void setmodel(String model) {
    this.model = model;
}
public String getYear(){
    return year;
}
public void setYear(){
    this.year = year;
}
public double getPrice(){
    return price;
}
public void setprice(double v) {
    if (price > 0) {
        this.price = price;
    }
}
    public void applyDiscount ( double discountPercentage){


    }


}


