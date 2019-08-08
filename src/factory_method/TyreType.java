package factory_method;

public enum TyreType {
    ROAD_TYRE("road tyre"), MOUNTAIN_TYRE("MTB tyre"), GRAVEL_TYRE("gravel tyre");

    private String tyre;

    TyreType(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return tyre;
    }
}