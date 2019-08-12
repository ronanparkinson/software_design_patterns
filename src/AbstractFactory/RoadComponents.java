package AbstractFactory;

public class RoadComponents implements Components {
    @Override
    public Saddle createSaddle() {
        return new RoadSaddle();
    }

    @Override
    public Pedals createPedals() {
        return new RoadPedals();
    }

    @Override
    public Handlebars createHandlebars() {
        return new RoadHandlebars();
    }
}
