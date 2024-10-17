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
    public Delegacion(String p_nombre, Calendar p_fechaVisita, Individuo p_individuo)
    {
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(new HashSet<>());
        this.inscribirIndividuo(p_individuo);
    }
    
    private void setIntegrantes(HashSet<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    public HashSet<Individuo> getIntegrantes(){
        return this.integrantes;
    }  

    public String tipoVisitante(){
        return "Delegacion";
    }

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
        return sumaEntradas - descuento;
    }
    
    public int cantidadIntegrantes(){
        int cont=0;
        for(Individuo individuo : this.getIntegrantes()){
            cont ++;
        }
        return cont;
    }
    
    public void mostrar(){
        System.out.println( "-------------------------------------------------------------\nDelegación: " + super.getNombre() +
                            "\n\nIntegrantes:");
        for(Persona persona : this.listarPersonas()){
            persona.mostrar();
        }
        
        
        System.out.println( "\nCantidad de Integrantes: " + this.cantidadIntegrantes() +
                            "\n-------------------------------------------------------------");
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equalsIgnoreCase(p_visitante)){
            this.mostrar();
        }
    }
    
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<>();
        for(Individuo individuo : this.getIntegrantes()){
            personas.add(individuo.getPersona());
        }
        return personas;
    }
    
}