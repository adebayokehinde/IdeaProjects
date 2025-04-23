public class Petro {
    public String stationLocation;
    public String petroType;
    public int petroQuantity;
    public double pricePerLiter;
    public double percentageDiscount;

    public Petro(String stationLocation, String petroType, int petroQuantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petroType = petroType;
        this.petroQuantity = petroQuantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = 0.0;
    }




    public String getstationLocation() {
        return stationLocation;
    }
    public void setstationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    public String getpetroType() {
        return petroType;
    }
    public void setpetroType(String petroType) {
        this.petroType = petroType;
    }
    public int getpetroQuantity() {
        return petroQuantity;
    }
    public void setpetroQuantity(int petroQuantity) {
        this.petroQuantity = petroQuantity;
    }
    public double getpricePerLiter() {
        return pricePerLiter;
    }
    public void setpricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
    public double getpercentageDiscount() {
        return percentageDiscount;
    }
    public void setpercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPurchaseAmount() {
        double totalPrice = pricePerLiter * petroQuantity;
        double discountAmount = totalPrice * (percentageDiscount / 100.0);
        return totalPrice - discountAmount;



    }


}
