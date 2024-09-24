
/**
 * La clase Rectangulo representa un rectángulo definido por un punto de origen, ancho y alto.
 * Proporciona métodos para establecer y obtener estos atributos, así como para calcular el perímetro, la superficie,
 * la distancia a otro rectángulo, y para mostrar la información del rectángulo.
 * 
 * @author Larroza Lautaro, Cintas Alejandro
 */
public class Rectangulo
{
    private Punto origen;
    private double ancho;
    private double alto;

    /**
     * Constructor para objetos de la clase Rectangulo con un punto de origen, ancho y alto específicos.
     * 
     * @param p_origen Punto que representa el origen del rectángulo.
     * @param p_ancho Ancho del rectángulo.
     * @param p_alto Alto del rectángulo.
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto)
    {
       this.setOrigen(p_origen);
       this.setAncho(p_ancho);
       this.setAlto(p_alto);
    }
    
    /**
     * Constructor para objetos de la clase Rectangulo con ancho y alto específicos, y origen en (0, 0).
     * 
     * @param p_ancho Ancho del rectángulo.
     * @param p_alto Alto del rectángulo.
     */
    public Rectangulo(double p_ancho, double p_alto)
    {
       this.setOrigen(new Punto(0.0, 0.0));
       this.setAncho(p_ancho);
       this.setAlto(p_alto);
    }
    
    /**
     * Establece el origen del rectángulo.
     * 
     * @param p_origen Punto que representa el origen del rectángulo.
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    /**
     * Establece el ancho del rectángulo.
     * 
     * @param p_ancho Ancho del rectángulo.
     */
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    /**
     * Establece el alto del rectángulo.
     * 
     * @param p_alto Alto del rectángulo.
     */
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    /**
     * Obtiene el origen del rectángulo.
     * 
     * @return Punto que representa el origen del rectángulo.
     */
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * Obtiene el ancho del rectángulo.
     * 
     * @return Ancho del rectángulo.
     */
    public double getAncho(){
        return this.ancho;
    }
    
    /**
     * Obtiene el alto del rectángulo.
     * 
     * @return Alto del rectángulo.
     */
    public double getAlto(){
        return this.alto;
    }

    /**
     * Desplaza el origen del rectángulo en las direcciones especificadas.
     * 
     * @param p_dx Desplazamiento en la dirección x.
     * @param p_dy Desplazamiento en la dirección y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
   
    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return Perímetro del rectángulo.
     */
    public double perimetro(){
        return 2 * (this.getAlto() + this.getAncho());
    }
   
    /**
     * Calcula la superficie del rectángulo.
     * 
     * @return Superficie del rectángulo.
     */
    public double superficie(){
        return this.getAlto() * this.getAncho();
    }

    /**
     * Calcula la distancia entre el origen del rectángulo y el origen de otro rectángulo.
     * 
     * @param otroRectangulo Otro rectángulo para calcular la distancia.
     * @return Distancia entre los orígenes de los dos rectángulos.
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
   
    /**
     * Devuelve el rectángulo con la mayor superficie entre el rectángulo actual y otro rectángulo.
     * 
     * @param otroRectangulo Otro rectángulo para comparar.
     * @return El rectángulo con la mayor superficie.
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        return this.superficie() > otroRectangulo.superficie() ? this : otroRectangulo;
    }
   
    /**
     * Muestra la información del rectángulo, incluyendo el origen, ancho, alto, superficie y perímetro.
     */
    public void mostrar(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: (" + this.getOrigen().getX() + ", " + this.getOrigen().getY() + ") - " + 
                           "Alto: " + this.getAlto() + " - " + "Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - " + "Perímetro: " + this.perimetro());
    }
    
    public String nombreFigura(){
        return "****** Rectangulo ******";
    }
}
