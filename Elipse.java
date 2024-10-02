
/**
 * Write a description of class Elipse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elipse extends FiguraGeometrica
{
    private double sEjeMayor;
    private double sEjeMenor;

    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro)
    {
        super(p_centro);
       this.setSEjeMayor(p_sEjeMayor);
       this.setSEjeMenor(p_sEjeMenor);
       
    }
    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor)
    {
        super(new Punto(0.0, 0.0));
       this.setSEjeMayor(p_sEjeMayor);
       this.setSEjeMenor(p_sEjeMenor);
       
    }

  
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }

    
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    public String nombreFigura(){
        return "****** Elipse ******";
    }
    
    public double superficie(){
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    public double distanciaA(Elipse otraElipse) {
        return this.getOrigen().distanciaA(otraElipse.getOrigen());
    }
    
    public Elipse elMayor(Elipse otraElipse){
        return this.superficie() > otraElipse.superficie() ? this : otraElipse;
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: (" + this.getOrigen().getX() + ", " + this.getOrigen().getY() + ")"  + " - Semieje Mayor: " + this.getSEjeMayor() + " - Semieje Menor: " + this.getSEjeMenor());
        System.out.println("Superficie: "+ this.superficie());
    }
}
