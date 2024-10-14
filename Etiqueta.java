
public abstract class Etiqueta
{
    private double costo;
   
    public Etiqueta(double p_costo)
    {
        this.setCosto(p_costo);
    }
    
    private void setCosto(double p_costo){
        this.costo=p_costo;
    }
    
    public double getCosto(){
        return this.costo;
    }

    public abstract double precio(int q);
   
    protected abstract String tipo();
    
    /*public String toString(){
        return this.tipo().equalsIgnoreCase("premium") ? "Tipo" + this.tipo() + super.toString() + " - Costo: " + this.getCVosto() + " - Colores: " + premium.getColores();
    }*/
}
