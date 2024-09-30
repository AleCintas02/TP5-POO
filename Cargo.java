import java.util.Calendar;

public class Cargo {
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horaDeDocencia;

    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horaDeDocencia) {
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHoraDeDocencia(p_horaDeDocencia);
    }

    private void setNombreCargo(String p_nombreCargo) {
        this.nombreCargo = p_nombreCargo;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    private void setHoraDeDocencia(int p_horaDeDocencia) {
        this.horaDeDocencia = p_horaDeDocencia;
    }

    public String getNombreCargo() {
        return this.nombreCargo;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    public int getHoraDeDocencia() {
        return this.horaDeDocencia;
    }

    public int antiguedad() {
        Calendar calendar = Calendar.getInstance();
        int anioActual = calendar.get(Calendar.YEAR);
        return anioActual - this.getAnioIngreso(); 
    }

    private double adicionalXAntiguedad() {
        double adicional = this.getSueldoBasico() * 0.01 * this.antiguedad();  
        return adicional;
    }

    public double sueldoDelCargo() {
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }

    public void mostrarCargo() {
        System.out.println(this.getNombreCargo() + " - Sueldo Básico: " + this.getSueldoBasico() + " - Sueldo Cargo: " + this.sueldoDelCargo() + " – Antigüedad: " + this.antiguedad() + " años");
        System.out.println("Horas de Docencia: " + this.getHoraDeDocencia());
    }
}
