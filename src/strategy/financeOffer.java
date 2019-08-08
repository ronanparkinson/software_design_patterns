package strategy;

public class financeOffer implements bicycleSaleStrategy{
    @Override
    public void sale() {
        System.out.println("Pay off your new bicycle over 12 months!");
    }
}
