public class pizzaClasica extends builderPizza{
    @Override
    public void buildIngredientes(){

        this.Pizza.setIngredientes("salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa(){

        this.Pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso(){

        this.Pizza.setTipoQueso("doble queso mozzarella tipo2");
    }
}
