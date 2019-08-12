package adapter;

public class EbikeAdapter implements PushBike {

    private Ebike ebike;

    EbikeAdapter(){
        ebike = new Ebike();
    }

    @Override
    public void pedal() {
        ebike.motor();
    }
}
