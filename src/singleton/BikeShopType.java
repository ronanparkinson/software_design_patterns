package singleton;

public enum BikeShopType {

    Bike;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
