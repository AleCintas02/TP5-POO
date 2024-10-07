
public class AdministracionGerencia
{
    
    public static void main(String []args){
        Servicio servicio1 = new Servicio("Servicio de limpieza", 50.0);
        Servicio servicio2 = new Servicio("Reparación de equipos", 120.0);
        Servicio servicio3 = new Servicio("Consultoría técnica", 200.0);
        Servicio servicio4 = new Servicio("Soporte técnico", 80.0);
        Servicio servicio5 = new Servicio("Mantenimiento preventivo", 150.0);
        Servicio servicio6 = new Servicio("Optimización de sistemas", 300.0);
        
        Hotel hotel1 = new Hotel("Hotel Paraíso", 150.0, 5, "Suite");
        Hotel hotel2 = new Hotel("Hotel Sol y Mar", 200.0, 3, "Habitación doble");
        Hotel hotel3 = new Hotel("Hotel Guarani", 700.0, 3, "Suite");
        
        Cabania cabania1 = new Cabania("Cabaña El Refugio", 120.0, 3, 2);
        
        hotel1.agregarServicio(servicio1);
        hotel1.agregarServicio(servicio2);
        hotel1.agregarServicio(servicio3);
        
        hotel2.agregarServicio(servicio2);
        hotel2.agregarServicio(servicio6);
        
        hotel3.agregarServicio(servicio5);
        
        cabania1.agregarServicio(servicio4);
        cabania1.agregarServicio(servicio5);
        cabania1.agregarServicio(servicio6);
        
        Gerencia gerencia1 = new Gerencia("Gerencia de Alojamientos");
         
        gerencia1.agregarAlojamiento(hotel1);
        gerencia1.agregarAlojamiento(hotel2);
        gerencia1.agregarAlojamiento(hotel3);
        gerencia1.agregarAlojamiento(cabania1);
        
        gerencia1.mostrarLiquidacion();
        
        System.out.println("Alojamiento tipo Hotel ---->" + gerencia1.contarAlojamiento("Hotel"));
        System.out.println("Alojamiento tipo Cabaña ---->" + gerencia1.contarAlojamiento("Cabaña"));
    }
}
