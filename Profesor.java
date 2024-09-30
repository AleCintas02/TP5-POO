import java.util.ArrayList;

public class Profesor extends Persona
{
    private String titulo;
    private ArrayList<Cargo> cargos;
    
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anioNacimiento, String p_titulo, Cargo p_cargo)
    {
        super(p_dni, p_nombre, p_apellido, p_anioNacimiento);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<>());
        this.agregarCargo(p_cargo);
    }
    
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anioNacimiento, String p_titulo, ArrayList<Cargo> p_cargos)
    {
        super(p_dni, p_nombre, p_apellido, p_anioNacimiento);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }
    
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    public boolean agregarCargo(Cargo p_cargo){
        if (this.getCargos().size() < 3) {
            return this.getCargos().add(p_cargo);
        }
        
        return false;
    }
    
    public boolean quitarCargo(Cargo p_cargo){ 
        return this.getCargos().remove(p_cargo);
    }
    
    public double sueldoTotal(){
        double sueldoTotal=0;
        for(Cargo cargo : this.getCargos()){
            sueldoTotal+=cargo.sueldoDelCargo();
        }
        return sueldoTotal;
    }
    
    public void listarCargos() {
        System.out.println("-***** Cargos Asignados *****-");
        System.out.println("---------------------------------------");
        for (Cargo cargo : this.getCargos()) {
            if (cargo instanceof Exclusivo) {
                ((Exclusivo) cargo).mostrarCargo();
            } else if (cargo instanceof SemiExclusivo) {
                ((SemiExclusivo) cargo).mostrarCargo();
            } else {
                cargo.mostrarCargo();  
            }
        }
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo());
        this.listarCargos();
        this.sueldoTotal();
    }
    
    public String mostrarLinea(){
        return "DNI: "+ this.getDNI() + "- Nombre: " + this.nomYApe() + "- Sueldo Total: " + this.sueldoTotal();
    }
    
}

