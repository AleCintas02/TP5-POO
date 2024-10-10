import java.util.Calendar;
import java.util.GregorianCalendar;

public class Prueba
{
    public static void main(String []args){
        Calendar fechaVisita = new GregorianCalendar(2024, Calendar.OCTOBER, 8);
        Delegacion delegacion1 = new Delegacion("Prueba", fechaVisita);
        
        Persona persona1 = new Persona(23213, "Carlos", "Perez", 1999);
        Persona persona2 = new Persona(54656, "Pepe", "Perez", 1999);
        Persona persona3 = new Persona(45544, "Jose", "Perez", 1999);
        
        Calendar fechaVisita1 = new GregorianCalendar(2024, Calendar.OCTOBER, 8);
        Calendar fechaVisita2 = new GregorianCalendar(2024, Calendar.OCTOBER, 8);
        Calendar fechaVisita3 = new GregorianCalendar(2024, Calendar.OCTOBER, 8);
        
        Individuo individuo1 = new Individuo("Individuo 1", fechaVisita1, persona1);
        Individuo individuo2 = new Individuo("Individuo 2", fechaVisita2, persona2);
        Individuo individuo3 = new Individuo("Individuo 3", fechaVisita3, persona3);
        
        delegacion1.inscribirIndividuo(individuo1);
        delegacion1.inscribirIndividuo(individuo2);
        delegacion1.inscribirIndividuo(individuo3);
        
      

        
    }
}
