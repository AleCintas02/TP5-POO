import java.util.ArrayList;

/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facultad
{
    
    private String nombre;
    private ArrayList<Profesor> profesores;

    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores)
    {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    public Facultad(String p_nombre, Profesor p_profesor)
    {
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.agregarProfesor(p_profesor);
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }
    
    public double totalAPagar(){
        double totalAPagar=0;
        
        for(Profesor profesor : this.getProfesores()){
            totalAPagar+=profesor.sueldoTotal();
        }
        
        return totalAPagar;
    }
    
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: " + this.getNombre() + " ***************");
        System.out.println("------------------------------------------------------------------");
        for(Profesor profesor : this.getProfesores()){
            System.out.println(profesor.mostrarLinea());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a pagar: "+totalAPagar());
    }
    
    public void listarProfesorCargos(){
        int contProfesores=0;
        System.out.println("*************** * Detalle de Profesores y cargos de Facultad: " + this.getNombre() + " ***************");
        System.out.println("------------------------------------------------------------------");
        for(Profesor profesor : this.getProfesores()){
            profesor.mostrar();
            contProfesores++;
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Hay " + contProfesores + " Profesores");
    }
  
}
