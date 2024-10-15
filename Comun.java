
public  class Comun extends Etiqueta
{
    double plus;     

    public Comun(double p_costo, double p_plus)
    {
       super(p_costo);
       this.setPlus(p_plus);
    }
    
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    
    public double getPlus(){
        return this.plus;
    }
    
    public double precio(int q){
        return ((q * this.getCosto()) + this.getPlus()) + (Math.floor(this.descuento(q)) / 100);
    }
    
    private double descuento(int q){
        
        if(q >= 11  && q <= 50){
            return 2.0;
        }else{
            if(q >= 51  && q <= 100){
                return 5.0;
            }else{
                if(q > 100){
                    return q / 10;
                }
            }
        }
        
        return 0.0;
        
    }
    
    protected String tipo(){
        return "Comun";
    }
    
    public String toString(){
        return super.toString() + " - Diseño: "+ this.getPlus();
    }
    
}
