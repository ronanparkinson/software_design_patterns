package factory_method;

public class RoadTyre implements Tyre{

    private TyreType tyreType;

    public RoadTyre(TyreType tyreType){
        this.tyreType = tyreType;
    }

    @Override
    public String toString() {
        return "Change to a " + tyreType;
    }

    @Override
    public TyreType getTypeType() {
        return tyreType;
    }
}
