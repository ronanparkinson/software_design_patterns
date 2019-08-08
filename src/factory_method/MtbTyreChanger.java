package factory_method;

public class MtbTyreChanger implements TyreChanger{
    @Override
    public Tyre changeTyre(TyreType tyreType) {
        return new MtbTyre(tyreType);
    }
}
