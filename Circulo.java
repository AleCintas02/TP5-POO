
/**
 * La clase Circulo representa un círculo definido por su radio y centro.
 * Proporciona métodos para establecer y obtener estos atributos, así como para calcular el perímetro, la superficie,
 * la distancia a otro círculo, y para mostrar la información del círculo.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Circulo extends Elipse
{
    private double radio;
   
    /**
     * Constructor para objetos de la clase Circulo con radio y centro específicos.
     * 
     * @param p_radio Radio del círculo.
     * @param p_centro Punto que representa el centro del círculo.
     */
    public Circulo(double p_radio, double p_sEjeMayor, double p_sEjeMenor, Punto p_centro)
    {
        super( p_sEjeMayor,p_sEjeMenor, p_centro);
        setRadio(p_radio);
    }
    
    /**
     * Constructor por defecto que inicializa el radio a 0 y el centro en el punto (0, 0).
     */
    public Circulo(double p_sEjeMayor, double p_sEjeMenor)
    {
        super(p_sEjeMayor,p_sEjeMenor);
       this.setRadio(0);
    }
    
    /**
     * Establece el radio del círculo.
     * 
     * @param p_radio Radio del círculo.
     */
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    /**
     * Obtiene el radio del círculo.
     * 
     * @return Radio del círculo.
     */
    public double getRadio(){
        return this.radio;
    }

    /**
     * Calcula el perímetro del círculo.
     * 
     * @return Perímetro del círculo.
     */
    public double perimetro(){
        return (this.getRadio() * Math.PI * 2);
    }
    
    /**
     * Calcula la superficie del círculo.
     * 
     * @return Superficie del círculo.
     */
    public double superficie(){
        return Math.PI * this.getRadio() * this.getRadio();
    }
 
    /**
     * Calcula la distancia entre el centro del círculo y el centro de otro círculo.
     * 
     * @param otroCirculo Otro círculo para calcular la distancia.
     * @return Distancia entre los centros de los dos círculos.
     */
    public double distanciaA(Circulo otroCirculo){
        return this.getOrigen().distanciaA(otroCirculo.getOrigen());
    }
    
    public String nombreFigura(){
        return "****** Circulo ******";
    }
}

