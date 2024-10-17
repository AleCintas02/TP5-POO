
public class Premium extends Etiqueta{
    private int colores;
    
    
    public Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }

    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    
    public int getColores(){return this.colores;}
    
    
    public double precio(int q){
        return (super.getCosto() + adicional()) * q;
    }
    
   
    private double adicional(){
        double costo = super.getCosto();
        int colores = this.getColores();
        
        switch(colores){
            case 1: return 0;
            
            case 2: return costo * 0.05;
            
            case 3: return costo * 0.07;
            
            default: return costo * (colores * 0.03);
        }        
    }

   
    protected String tipo(){
        return "Premium";
    }
    
    public String toString(){
        return super.toString() + " - Colores: "+ this.getColores();
    }
}

    

