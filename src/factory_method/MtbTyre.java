package factory_method;

public class MtbTyre implements Tyre{
    private TyreType tyreType;

    public MtbTyre(TyreType tyreType){
        this.tyreType = tyreType;
    }

    @Override
    public String toString() {
        return "Change to a " + tyreType ;
    }

    @Override
    public TyreType getTypeType() {
        return null;
    }
}
