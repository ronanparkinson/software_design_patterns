package strategy;

public class discountOffer implements bicycleSaleStrategy{

    @Override
    public void sale() {
        System.out.println("Receive up to 20% off your new bicycle now!");
    }
}
