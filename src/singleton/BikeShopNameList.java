package singleton;

public final class BikeShopNameList {

    private static BikeShopNameList name;

    private BikeShopNameList(){
        if (name == null){
            name = this;
        }
        else {
            throw new IllegalStateException("This bike shop already exists");
        }
    }

    public static synchronized BikeShopNameList getName(){
        if(name == null){
            name = new BikeShopNameList();
        }
        return name;
    }
}
