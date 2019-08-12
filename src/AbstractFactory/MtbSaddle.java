package AbstractFactory;

public class MtbSaddle implements Saddle {

    static final String desc = "This is a mountain bike saddle";

    @Override
    public String componentDesc() {
        return desc;
    }
}
