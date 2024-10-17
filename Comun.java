
public class Comun extends Etiqueta{
    private double plus;
    
    /**
     * Constructor de la clase `Comun` que permite crear una etiqueta Común con un costo y un valor de "plus" específicos.
     * 
     * @param p_costo El costo de la etiqueta Común.
     * @param p_plus El valor del "plus" de la etiqueta.
     */
    public Comun(double p_costo, double p_plus){
        super(100);
        this.setPlus(p_plus);
    }

    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    
    public double getPlus(){return this.plus;}
    
    /**
     * Calcula el precio total de las etiquetas Comunes en función de una cantidad específica.
     * 
     * @param q La cantidad de etiquetas Comunes.
     * @return El precio total de las etiquetas Comunes.
     */
    public double precio(int q){
        double total = (super.getCosto() * q) + this.getPlus();
        double descuento = total * descuento(q);
        
        return total - descuento;
    }
    
    /**
     * Calcula el descuento aplicado al precio total de las etiquetas Comunes en función de la cantidad.
     * 
     * @param q La cantidad de etiquetas Comunes.
     * @return El valor del descuento.
     */
    private double descuento(int q){
        double costo = super.getCosto();
        
        if(q >= 1 && q <= 10){
            return 0;
        }
        else if(q > 10 && q <= 50){
            return 0.02;
        }
        else if(q > 50 && q <= 100){
            return 0.05;
        }
        else{
            return (q / 10) * 0.01;
        }
    }
    
    /**
     * Determina el tipo de etiqueta (Común).
     * 
     * @return El tipo de etiquetas
     */
    protected String tipo(){
        return "Común";
    }
    
    public String toString(){
        return super.toString() + " - Diseño: $"+ this.getPlus();
    }
    
}
