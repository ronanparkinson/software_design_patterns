package factory_method;

public class RoadTyreChanger implements TyreChanger{

    @Override
    public Tyre changeTyre(TyreType tyreType) {
        return new RoadTyre(tyreType);
    }
}
