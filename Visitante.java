import java.util.Calendar;
import java.util.HashSet;


public abstract class Visitante
{
    private String nombre;
    private Calendar fechaVisita;
    
    
    
    public Visitante(String p_nombre, Calendar p_fechaVisita)
    {
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }

    public abstract void mostrar();
    
    public abstract double entrada();
    
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    public abstract String tipoVisitante();
    
    public abstract HashSet<Persona> listarPersonas();
    
}
