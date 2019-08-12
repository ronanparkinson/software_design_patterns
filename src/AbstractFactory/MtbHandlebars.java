package AbstractFactory;

public class MtbHandlebars implements Handlebars{

    static final String desc = "These are mountain bike Handlebars";

    @Override
    public String componentDesc() {
        return desc;
    }
}
