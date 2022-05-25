public class pizza {
    private String ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public pizza(){}

    public String getIngredientes() {
        return ingredientes;
    }

    public pizza setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public pizza setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
        return this;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public pizza setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public void showInfo(){
        System.out.println("Ingredientes" + ingredientes);
        System.out.println("Tipo de masa" + tipoMasa);
        System.out.println("Tipo de queso" + tipoQueso);
    }
}
