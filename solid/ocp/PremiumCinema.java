package ocp;

public class PremiumCinema extends Cinema {
    public PremiumCinema(double price){
        this.price=price;
    }
    @Override
    public double calculateAdminFee(){
        return this.price*20/100;
    }
    
}
