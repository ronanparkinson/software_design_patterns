package observer;

public enum RoadSlope {

    Ascent, Descent, Flat;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
