package factory_method;

public class app {
    private final TyreChanger tyreChanger;

    public app(TyreChanger tyreChanger) {
        this.tyreChanger = tyreChanger;
    }

    public static void main(String[] args) {
        app app = new app(new RoadTyreChanger());
        app.tyreChanger();

        app = new app(new MtbTyreChanger());
        app.tyreChanger();
    }

    private void tyreChanger() {
        Tyre tyre;
        tyre = tyreChanger.changeTyre((TyreType.ROAD_TYRE));
        System.out.println(tyre.toString());
        tyre = tyreChanger.changeTyre((TyreType.MOUNTAIN_TYRE));
        System.out.println(tyre.toString());
    }
}
