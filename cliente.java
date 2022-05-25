public class cliente {
    public static void main(String[] args){
        owner Cris = new owner();
        builderPizza carnivora = new pizzaCarnivora();
        builderPizza hawaiana = new pizzaHawaiana();
        builderPizza clasica = new pizzaClasica();

        Cris.setBuilder(carnivora);
        Cris.armarPizza();
        pizza pizza1 = Cris.getPizzaArmada();
        pizza1.showInfo();

        Cris.setBuilder(hawaiana);
        Cris.armarPizza();
        pizza pizza2 = Cris.getPizzaArmada();
        pizza2.showInfo();

        Cris.setBuilder(clasica);
        Cris.armarPizza();
        pizza pizza3 = Cris.getPizzaArmada();
        pizza3.showInfo();
    }
}
