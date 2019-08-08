package strategy;


public class app {
    public static void main(String[] args) {
        System.out.println("Come in and see our amazing offers now!");
        bicycleSupplier bikeShop = new bicycleSupplier(new equipmentOffer());
        bikeShop.sell();
        System.out.println("See our range of discounted bikes!");
        bikeShop.priceAdjustment(new discountOffer());
        bikeShop.sell();
        System.out.println("Lets workout what suits you best for your new bicycle!");
        bikeShop.priceAdjustment(new financeOffer());
        bikeShop.sell();
    }
}