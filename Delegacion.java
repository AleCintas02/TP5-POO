import  java.util.Calendar;
import java.util.HashSet;

/**
 * Write a description of class Delegacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Delegacion extends Visitante
{
    private HashSet<Individuo> integrantes;
    
    /**
     * Constructor for objects of class Delegacion
     */
    public Delegacion(String p_nombre, Calendar p_fechaVisita,HashSet<Individuo> p_integrantes)
    {
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(p_integrantes);

    }
    public Delegacion(String p_nombre, Calendar p_fechaVisita)
    {
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(new HashSet<>());
    }
    
    private void setIntegrantes(HashSet<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public HashSet<Individuo> getIntegrantes(){
        return this.integrantes;
    }  

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void inscribirIndividuo(Individuo p_individuo){
        this.getIntegrantes().add(p_individuo);
    }
    
    public boolean quitarIndividuo(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    public double entrada(){
        double sumaEntradas=0;
        for(Individuo individuo : this.getIntegrantes()){
            sumaEntradas+= individuo.entrada();
        }
        double descuento = sumaEntradas * 0.10;
        double total = sumaEntradas - descuento;
    }
    
    public int cantidadIntegrantes(){
        int cont=0;
        for(Individuo individuo : this.getIntegrantes()){
            cont ++;
        }
    }
    
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<>();
        for(Persona persona: this.getIntegrantes()){
            personas.add(persona);
        }
        return personas;
    }
    
}