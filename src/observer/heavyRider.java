package observer;

public class heavyRider implements SlopeType{

    @Override
    public void changeSlope(RoadSlope slope) {
        switch (slope){
            case Flat:
                System.out.println("Let's put some power down!");
                break;
            case Descent:
                System.out.println("Gotta gain the time I lost on the ascent back!");
                break;
            case Ascent:
                System.out.println("I need to pace myself now!");
                break;
            default:
                break;
        }
    }
}
