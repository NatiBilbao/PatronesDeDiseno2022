public class pizzaHawaiana extends builderPizza{

    @Override
    public void buildIngredientes(){

        this.Pizza.setIngredientes("piña, salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa(){

        this.Pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso(){

        this.Pizza.setTipoQueso("queso mozzarella tipo2");
    }
}
