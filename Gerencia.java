import java.util.ArrayList;

public class Gerencia
{
    
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;

   
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientosAlquilados)
    {
       this.setNombre(p_nombre);
       this.setAlojamientos(p_alojamientosAlquilados);
    }
    
    public Gerencia(String p_nombre)
    {
       this.setNombre(p_nombre);
       this.setAlojamientos(new ArrayList<>());
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setAlojamientos(ArrayList<Alojamiento> p_alojamientosAlquilados){
        this.alojamientosAlquilados = p_alojamientosAlquilados;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().remove(p_alojamiento);
    }
    
    public int contarAlojamiento(String tipoAlojamiento){
        int cont=0;
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            cont += alojamiento.contar(tipoAlojamiento);
        }
        
        return cont;
    }
    
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación-------------------");
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            alojamiento.liquidar();
        }
    }
    
    

    
}
