package AbstractFactory;

public class MtbComponents implements Components {
    @Override
    public Saddle createSaddle() {
        return new MtbSaddle();
    }

    @Override
    public Pedals createPedals() {
        return new MtbPedals();
    }

    @Override
    public Handlebars createHandlebars() {
        return new MtbHandlebars();
    }
}
