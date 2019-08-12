package AbstractFactory;

public class MtbPedals implements Pedals {

    static final String desc = "These are mountain bike pedals";

    @Override
    public String componentDesc() {
        return desc;
    }
}
