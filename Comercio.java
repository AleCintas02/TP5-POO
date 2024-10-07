
public class Comercio
{
    public static void main(String [] args){
        // Instancia de la clase Lavarropas
        Lavarropas lavarropas = new Lavarropas("Samsung", 35000.0f, 10, 12, 8.5f, true);
        
        // Instancia de la clase Cocina
        Cocina cocina = new Cocina("LG", 600.0f, 5, 4, 7000, "60x60x85");
        
        // Instancia de la clase Heladera
        Heladera heladera = new Heladera("Whirlpool", 1200.0f, 7, 15, 2, true);
        
        
        cocina.imprimir();
        System.out.println("Cuotas: 6  -  Interes : 2.53%");
        System.out.println("Valor Cuota: "  + cocina.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota Con Adicionales: "  + cocina.creditoConAdicional(6, 2.53f));
        
        heladera.imprimir();
        System.out.println("Cuotas: 6  -  Interes : 2.53%");
        System.out.println("Valor Cuota: "  + heladera.cuotaCredito(6, 2.53f));
        System.out.println("Valor Cuota Con Adicionales: "  + heladera.creditoConAdicional(6, 2.53f));
        

    }
}
