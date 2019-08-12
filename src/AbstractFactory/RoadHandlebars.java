package AbstractFactory;

public class RoadHandlebars implements Handlebars {
    static final String desc = "These are road bike Handlebars";

    @Override
    public String componentDesc() {
        return desc;
    }
}