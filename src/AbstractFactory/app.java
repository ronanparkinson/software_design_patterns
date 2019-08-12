package AbstractFactory;

public class app {
    private Saddle saddle;
    private Pedals pedals;
    private Handlebars handlebars;

    public void createComponents(final Components components){
        setSaddle(components.createSaddle());
        setHandlebar(components.createHandlebars());
        setPedals(components.createPedals());
    }

    private void setPedals(Pedals pedals) {
        this.pedals = pedals;
    }

    private void setHandlebar(Handlebars handlebars) {
        this.handlebars = handlebars;
    }

    private void setSaddle(Saddle saddle) {
        this.saddle = saddle;
    }

    private Pedals getPedals(final Components components) {
        return components.createPedals();
    }

    private Handlebars getHandlebar(final Components components) {
        return components.createHandlebars();
    }

    private Saddle getSaddle(final Components components) {
        return components.createSaddle();
    }

    Saddle getSaddle(){
        return saddle;
    }

    Handlebars getHandlebars(){
        return handlebars;
    }

    Pedals getPedals(){
        return pedals;
    }

    public static class ComponentMaker {

        public enum disciplines {
            MTB, ROAD
        }

        public static Components makeComponents(disciplines discipline) {
            switch (discipline) {
                case MTB:
                    return new MtbComponents();
                case ROAD:
                    return new RoadComponents();
                default:
                    throw new IllegalArgumentException("Discipline unknown!");
            }
        }
    }

    public static void main(String[] args) {
        app app = new app();

        System.out.println("Road Components");
        app.createComponents(ComponentMaker.makeComponents(ComponentMaker.disciplines.ROAD));
        System.out.println(app.getHandlebars().componentDesc());
        System.out.println(app.getPedals().componentDesc());
        System.out.println(app.getSaddle().componentDesc());

        System.out.println("MTB Components");
        app.createComponents(ComponentMaker.makeComponents(ComponentMaker.disciplines.MTB));
        System.out.println(app.getHandlebars().componentDesc());
        System.out.println(app.getPedals().componentDesc());
        System.out.println(app.getSaddle().componentDesc());
    }
}