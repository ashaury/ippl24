package ocp;

public class DeluxeCinema extends Cinema{
    public DeluxeCinema(double price){
        this.price = price;
    }
    @Override
    public double calculateAdminFee(){
        return this.price*12/100;
    }
}
