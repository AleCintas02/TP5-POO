import java.util.ArrayList;

public class Hotel extends Alojamiento
{
    private String tipoHabitacion;

   
    public Hotel(String p_nombre, double p_precio, int p_diasAlquiler, ArrayList<Servicio> p_servicios, String p_tipoHabitacion)
    {
        super(p_nombre, p_precio, p_diasAlquiler, p_servicios);
        this.setTipoHabitacion(p_tipoHabitacion);
    }
    
    private void setTipoHabitacion(String p_tipoHabitacion){
        this.tipoHabitacion=p_tipoHabitacion;
    }
    
    public String getTipoHabitaciones(){
        return this.tipoHabitacion;
    }
    
    public int contar(String p_alojamiento){
        return p_alojamiento.equalsIgnoreCase("Hotel") ? 1 : 0;
    }
    
    public double costo(){
        if(this.getTipoHabitaciones().equalsIgnoreCase("Single")){
            return  this.getDiasAlquiler() * 20;
        }else{
            if(this.getTipoHabitaciones().equalsIgnoreCase("Doble")){
               return this.getDiasAlquiler() * 35;
            }
        }
        return super.costo();
    }
    
    public void liquidar(){
        System.out.println("Habitacion " + this.getTipoHabitaciones());
        System.out.println("Total: ------> " + this.costo());
    }
}
