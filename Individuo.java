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
        int result = p_fecha.compareTo(this.getFechaVisita());
        if(result == 0 && p_visitante.equalsIgnoreCase("Individuo")){
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
