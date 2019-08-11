package observer;

public class lightRider implements SlopeType {


    @Override
    public void changeSlope(RoadSlope slope) {
        switch (slope){
            case Flat:
                System.out.println("Get nice and aero now!");
                break;
            case Ascent:
                System.out.println("Now would be good to gain time on your opponents!");
                break;
            case Descent:
                System.out.println("Speed is everything here!");
                break;
            default:
                break;
        }
    }
}