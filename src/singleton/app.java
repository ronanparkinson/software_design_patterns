package singleton;

public class app {
    public static void main(String[] args) {

        bikeShop bikeShop1 = bikeShop.getBikeShop();
        bikeShop bikeShop2 = bikeShop.getBikeShop();

        System.out.println("bikeshop 1 = { " + bikeShop1 + " }");
        System.out.println("bikeshop 2 = { " + bikeShop2 + " }");

        BikeShopNameList bikeShopNameList1 = BikeShopNameList.getName();
        BikeShopNameList bikeShopNameList2 = BikeShopNameList.getName();

        System.out.println("bikeShopNameList 1 = { " + bikeShopNameList1 + " }");
        System.out.println("bikeShopNameList 2 = { " + bikeShopNameList2 + " }");

        BikeShopType bikeShopType1 = BikeShopType.Bike;
        BikeShopType bikeShopType2 = BikeShopType.Bike;

        System.out.println("bikeShopType 1 = { " + bikeShopType1 + " }");
        System.out.println("bikeShopType 2 = { " + bikeShopType2 + " }");
    }
}
