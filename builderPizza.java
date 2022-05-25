public abstract class builderPizza {
    protected pizza Pizza;

    public pizza getPizza(){

        return Pizza;
    }
    public void createPizza(){

        this.Pizza = new pizza();
    }

    public abstract void buildIngredientes();
    public abstract void buildTipoMasa();
    public abstract void buildTipoQueso();
}
