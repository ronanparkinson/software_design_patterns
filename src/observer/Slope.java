package observer;

import java.util.ArrayList;
import java.util.List;

public class Slope {

    private RoadSlope slope;
    private List<SlopeType> observers;

    public Slope(){
        observers = new ArrayList<>();
        slope = RoadSlope.Flat;
    }

    public void addSlope(SlopeType slopeType){
        observers.add(slopeType);
    }

    public void removeSlope(SlopeType slopeType){
        observers.remove(slopeType);
    }

    public void newSlope(){
        RoadSlope[] newSlopes = RoadSlope.values();
        slope = newSlopes[(slope.ordinal() + 1) % newSlopes.length];
        notifyObservers();
    }

    private void notifyObservers() {
        for (SlopeType slopeType : observers){
            slopeType.changeSlope(slope);
        }
    }
}