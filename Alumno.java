/**
 * La clase Alumno representa a un estudiante con LU, nombre, apellido y dos notas.
 * Proporciona métodos para establecer las notas, calcular el promedio,
 * verificar si aprueba y mostrar la información del alumno.
 */
public class Alumno extends Persona {
    private int lu;
    private double nota1;
    private double nota2;
    
    /**
     * Constructor para objetos de la clase Alumno.
     * Inicializa las notas a 0.0.
     * 
     * @param p_lu      Número de legajo universitario (LU) del alumno.
     * @param p_nombre  Nombre del alumno.
     * @param p_apellido Apellido del alumno.
     */
    public Alumno(int p_dni, String p_nombre, String p_apellido, int p_anio, int p_lu) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    /**
     * Establece el número de legajo universitario (LU) del alumno.
     * 
     * @param p_lu El número de legajo universitario.
     */
    private void setLu(int p_lu) {
        this.lu = p_lu;
    }


    
    /**
     * Establece la primera nota del alumno.
     * 
     * @param p_nota La primera nota del alumno.
     */
    public void setNota1(double p_nota) {
        this.nota1 = p_nota;
    }

    /**
     * Establece la segunda nota del alumno.
     * 
     * @param p_nota La segunda nota del alumno.
     */
    public void setNota2(double p_nota) {
        this.nota2 = p_nota;
    }

    /**
     * Devuelve el número de legajo universitario (LU) del alumno.
     * 
     * @return El número de legajo universitario.
     */
    public int getLu() {
        return this.lu;
    }

    /**
     * Devuelve la primera nota del alumno.
     * 
     * @return La primera nota del alumno.
     */
    public double getNota1() {
        return this.nota1;
    }

    /**
     * Devuelve la segunda nota del alumno.
     * 
     * @return La segunda nota del alumno.
     */
    public double getNota2() {
        return this.nota2;
    }

    /**
     * Devuelve el nombre y apellido del alumno.
     * 
     * @return Una cadena con el nombre y apellido del alumno.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Calcula y devuelve el promedio de las dos notas del alumno.
     * 
     * @return El promedio de las dos notas del alumno.
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * Verifica si el alumno aprueba.
     * 
     * @return true si el promedio de las notas es mayor que 7.0 y ambas notas son mayores o iguales a 6.0, false en caso contrario.
     */
    private boolean aprueba() {
        return this.promedio() > 7.0 && this.getNota1() >= 6.0 && this.getNota2() >= 6.0;
    }
   
    /**
     * Devuelve una cadena indicando si el alumno está "APROBADO" o "DESAPROBADO".
     * 
     * @return "APROBADO" si el alumno aprueba, "DESAPROBADO" en caso contrario.
     */
    private String leyendaAprueba() {
        return this.aprueba() ? "APROBADO" : "DESAPROBADO";
    }
    
    /**
     * Muestra la información del alumno, incluyendo nombre, apellido, LU, notas, promedio y estado (aprobado/desaprobado).
     */
    public void mostrar() {
    super.mostrar(); 
    System.out.println("LU: " + this.lu + " Notas: " + this.getNota1() + " - " + this.getNota2());
    System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
}
}
