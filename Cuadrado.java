
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo
{   
    private double lado;
   
    public Cuadrado(double p_ancho, double p_alto, Punto p_origen, double p_lado)
    {
        super(p_origen, p_ancho, p_alto);
        this.setLado(p_lado);
        
    }
    
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    
    public String nombreFigura(){
        return "****** Cuadrado ******";
    }
    
    public double getLado(){
        return this.lado;
    }
    
    public void características(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen() + " - Lado: " + this.getLado());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
    }
    
}
