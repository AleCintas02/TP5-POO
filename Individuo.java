import java.util.*;

public class Individuo extends Visitante
{
    Persona persona;

    public Individuo(String p_nombre, Calendar p_fechaVisita, Persona p_persona)
    {
       super(p_nombre,p_fechaVisita);
       this.setPersona(p_persona);
    }
    
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public String tipoVisitante(){
        return "Individuo";
    }
    
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equalsIgnoreCase(p_visitante)){
            this.mostrar();
        }
    }
    
    public double entrada(){
        return 10.0;
    }
    
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<>();
        personas.add(this.getPersona());
        return personas;
    }
    
    
}
