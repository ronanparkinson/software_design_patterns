package strategy;

public class equipmentOffer implements bicycleSaleStrategy{

    @Override
    public void sale() {
        System.out.println("Get a free helmet and stylish sunglasses when" +
                " you purchase a new bicycle");
    }
}
