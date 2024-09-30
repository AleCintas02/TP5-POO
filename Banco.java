import java.util.*;
/**
 * Esta clase ejecutable permite interactuar con una cuenta corriente y caja de ahorro de una persona.
 * Tambien permite realizar operaciones como depósitos, extracciones y 
 * mostrar información de las cuentas bancaria.
 * 
 * @author Cintas Alejandro
 * @author Larroza Lautaro
 */
public class Banco
{
    public static void main(String []args){
        Calendar fechaNacimiento = new GregorianCalendar(1990, Calendar.SEPTEMBER, 6);
        Persona P1 = new Persona(44542020, "Juán", "Pérez", fechaNacimiento);
        
        CajaDeAhorro Caja1 = new CajaDeAhorro(1, P1, 3500.0);
        System.out.println("\n***Mostrar original***");
        Caja1.mostrar();
        System.out.println("\n***Extraccion de 300***");
        Caja1.extraer(300.0);
        Caja1.mostrar();
        System.out.println("\n***Deposito de 1000***");
        Caja1.depositar(1000.0);
        Caja1.mostrar();
        System.out.println("\n***Extraccion de 100***");
        Caja1.extraer(100.0);
        Caja1.mostrar();
        System.out.println("\n");
        
        CuentaCorriente Cuenta1 = new CuentaCorriente(1,P1, 3500.0);
        System.out.println("\n***Mostrar original***");
        Cuenta1.mostrar();
        System.out.println("\n***Extraccion de 4500 (mas del limite)***");
        Cuenta1.extraer(4500.0);
        
        System.out.println("\nCumpleaños");
        if (P1.esCumpleanos()) {
            System.out.println("¡Feliz cumpleaños, " + P1.getNombre() + "!");
        } else {
            System.out.println("Hoy no es el cumpleaños de " + P1.getNombre() + ".");
        }
    }
}
