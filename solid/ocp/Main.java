package ocp;

public class Main {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100);
        double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
    
}
