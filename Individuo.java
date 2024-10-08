import java.util.Calendar;


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
    
    public Persona getPersona(){
        return this.persona;
    }
    
    public String tipoVisitante(){
        return "Individuo";
    }
    
}
