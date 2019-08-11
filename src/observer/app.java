package observer;

public class app {
    public static void main(String[] args) {

        Slope slope = new Slope();
        slope.addSlope(new lightRider());
        slope.addSlope(new heavyRider());

        slope.newSlope();
        slope.newSlope();
        slope.newSlope();
        slope.newSlope();


    }
}
