import java.util.Calendar;

public class VentaDeEntradas {
    public static void main(String[] args) {
        // Se crea un zoológico llamado "El Caribú".
        Zoologico zoo = new Zoologico("El Caribú");

        // Se crean tres personas individuales.
        Persona persona1 = new Persona(11223445, "Maria", "López", 2003);
        Persona persona2 = new Persona(22334455, "Carlos", "Rodríguez", 1930);
        Persona persona3 = new Persona(22334455, "Laura", "Martínez", 1940);

        // Se establece una fecha de visita (22 de septiembre de 2024).
        Calendar fechaVisita = Calendar.getInstance();
        fechaVisita.set(2024, 9 - 1, 22);

        // Se crean tres individuos como visitantes.
        Individuo individuo1 = new Individuo(persona1.nomYApe(), fechaVisita, persona1);
        Individuo individuo2 = new Individuo(persona2.nomYApe(), fechaVisita, persona2);
        Individuo individuo3 = new Individuo(persona3.nomYApe(), fechaVisita, persona3);

        // Se crea una delegación llamada "PAMI" y se agregan individuos a la delegación.
        Delegacion delegacionPami = new Delegacion("PAMI", fechaVisita, individuo2);
        delegacionPami.inscribirIndividuo(individuo3);

        // Se agregan visitantes al zoológico.
        zoo.nuevoVisitante(individuo1);
        zoo.nuevoVisitante(delegacionPami);

        // Se listan los visitantes en el zoológico por la fecha de visita.
        zoo.listarVisitantePorFecha(fechaVisita);

        // Se establecen fechas para calcular la recaudación.
        Calendar primeroDelMes = Calendar.getInstance();
        primeroDelMes.set(2024, 8, 1);

        Calendar nuevoMes = Calendar.getInstance();
        nuevoMes.set(2024, 9, 1);

        // Se calcula y muestra la recaudación de la delegación "PAMI".
        System.out.println("\nLa delegación PAMI ha recaudado: $" + delegacionPami.entrada());

        // Se calcula y muestra la recaudación del último mes (septiembre de 2016).
        System.out.format("\nDurante el último mes (%tB - %tB) ", primeroDelMes, nuevoMes);
        System.out.println("se recaudó: $" + zoo.recaudacion(primeroDelMes, nuevoMes) + "\n");

        // Se listan los visitantes de tipo "Delegacion" en la fecha de visita.
        zoo.listarTipoVisitantePorFecha(fechaVisita, "Delegacion");
    }
}