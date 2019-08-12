package singleton;

public final class bikeShop {

    private bikeShop(){}

    private static final bikeShop BIKE_SHOP = new bikeShop();

    public static bikeShop getBikeShop() {
        return BIKE_SHOP;
    }
}