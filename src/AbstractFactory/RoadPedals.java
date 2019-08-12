package AbstractFactory;

public class RoadPedals implements Pedals {
    static final String desc = "These are road bike pedals";

    @Override
    public String componentDesc() {
        return desc;
    }
}