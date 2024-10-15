import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Zoologico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoologico{
    // instance variables - replace the example below with your own
    String nombre;
    private ArrayList<Visitante> visitantes;

    /**
     * Constructor for objects of class Zoologico
     */
    public Zoologico(String p_nombre,ArrayList<Visitante> p_visitantes){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    public Zoologico(String p_nombre){
        // initialise instance variables
        this.setNombre(p_nombre);
        this.setVisitantes(new ArrayList<>());
    }
    
    private void setNombre(String p_nombre){
       this.nombre = p_nombre;
    }
     private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    } 

    public void nuevoVisitante (Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    
    public boolean quitarVisitante(Visitante p_visitante){
      return this.getVisitantes().remove(p_visitante);  
    }
    
    public void listarVisitantePorFecha(Calendar p_fecha){
       
        for(Visitante visitante : this.getVisitantes()){
            if(visitante.getFechaVisita().equals(p_fecha)){
                visitante.mostrar();
        }
    }
}
    
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_visitante){
        for(Visitante visitante : this.getVisitantes()){
            if(visitante.getFechaVisita().equals(p_fecha) && visitante.tipoVisitante().equalsIgnoreCase(p_visitante)){
                visitante.tipoVisitante();
            }
        }
    }
    
    public double recaudacion (Calendar p_fechaDesde, Calendar p_fechaHasta){
        double recaudacionTotal = 0;
        for(Visitante visitante : this.getVisitantes()){
            Calendar fechaVisita = visitante.getFechaVisita();
            if (fechaVisita.after(p_fechaDesde) && fechaVisita.before(p_fechaHasta)){
                recaudacionTotal += visitante.entrada();
            }
        }
        return recaudacionTotal;
    }
    
    public HashSet<Persona> listarPersonasQueVisitaronElZoologico(){
        HashSet<Persona> personas = new HashSet<>();
        for(Visitante visitante : this.getVisitantes()){
            Individuo individuo = (Individuo) visitante;
            personas.add(individuo.getPersona());
        }
        return personas;
    }
    
}