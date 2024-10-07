import java.util.ArrayList;

public class Cabania extends Alojamiento
{
    
    private int nroHabitaciones;

   
    public Cabania(String p_nombre, double p_precio, int p_diasAlquiler, ArrayList<Servicio> p_servicios, int p_nroHabitaciones)
    {
        super(p_nombre, p_precio, p_diasAlquiler, p_servicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    
    private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones=p_nroHabitaciones;
    }
    
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    
    public int contar(String p_alojamiento){
        return p_alojamiento.equalsIgnoreCase("Cabaña") ? 1 : 0;
    }
    
    public double costo(){
        return this.getNroHabitaciones() * 30;
    }
    
    public void liquidar(){
        System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
        System.out.println("Total: -------> " + this.costo());
    }
    
    
}
