package strategy;

public class bicycleSupplier {
    private bicycleSaleStrategy bicycleSaleStrategy;

    public bicycleSupplier(bicycleSaleStrategy bicycleSaleStrategy){
        this.bicycleSaleStrategy = bicycleSaleStrategy;
    }

    public void priceAdjustment(bicycleSaleStrategy bicycleSaleStrategy){
        this.bicycleSaleStrategy = bicycleSaleStrategy;
    }

    public void sell(){
        bicycleSaleStrategy.sale();
    }
}