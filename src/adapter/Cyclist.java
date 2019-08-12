package adapter;

public class Cyclist {

    private PushBike pushBike;

    public Cyclist(PushBike pushBike){
        this.pushBike = pushBike;
    }

    public void setPushBike(PushBike pushBike){
        this.pushBike = pushBike;
    }

    public void pedal() {
        pushBike.pedal();
    }
}
