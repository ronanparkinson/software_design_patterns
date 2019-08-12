package AbstractFactory;

public class RoadSaddle implements Saddle {
    static final String desc = "This is a road bike saddle";

    @Override
    public String componentDesc() {
        return desc;
    }
}
