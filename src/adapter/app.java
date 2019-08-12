package adapter;

public class app {
    public static void main(String[] args) {

        Cyclist cyclist = new Cyclist(new EbikeAdapter());
        cyclist.pedal();
    }
}