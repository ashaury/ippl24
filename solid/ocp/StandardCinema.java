package ocp;

public class StandardCinema extends Cinema {
    public StandardCinema(double price){
        this.price=price;
    }
    @Override
    public double calculateAdminFee(){
        return this.price*10/100;
    }
}
