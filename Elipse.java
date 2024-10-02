
/**
 * Write a description of class Elipse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elipse
{
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;

    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro)
    {
       this.setSEjeMayor(p_sEjeMayor);
       this.setSEjeMenor(p_sEjeMenor);
       this.setCentro(p_centro);
    }
    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor)
    {
       this.setSEjeMayor(p_sEjeMayor);
       this.setSEjeMenor(p_sEjeMenor);
       this.setCentro(new Punto(0.0, 0.0));
    }

  
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    public Punto getCentro(){
        return this.centro;
    }
    
    public String nombreFigura(){
        return "****** Elipse ******";
    }
    
    public double superficie(){
        return Math.PI * this.getSEjeMayor() * this.getSEjeMenor();
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public double distanciaA(Elipse otraElipse) {
        return this.getCentro().distanciaA(otraElipse.getCentro());
    }
    
    public Elipse elMayor(Elipse otraElipse){
        return this.superficie() > otraElipse.superficie() ? this : otraElipse;
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: (" + this.getCentro().getX() + ", " + this.getCentro().getY() + ")"  + " - Semieje Mayor: " + this.getSEjeMayor() + " - Semieje Menor: " + this.getSEjeMenor());
        System.out.println("Superficie: "+ this.superficie());
    }
}
