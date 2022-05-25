public class owner {
    private builderPizza Builder;

    public pizza getPizzaArmada(){
        return Builder.getPizza();
    }

    public void setBuilder(builderPizza builder) {
        Builder = builder;
    }

    public void armarPizza(){
        this.Builder.createPizza();
        this.Builder.buildIngredientes();
        this.Builder.buildTipoMasa();
        this.Builder.buildTipoQueso();
    }
}
