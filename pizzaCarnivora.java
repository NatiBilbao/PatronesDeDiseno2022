public class pizzaCarnivora extends builderPizza{
    @Override
    public void buildIngredientes(){

        this.Pizza.setIngredientes("carne, salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa(){

        this.Pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso(){

        this.Pizza.setTipoQueso("queso mozzarella");
    }
}
