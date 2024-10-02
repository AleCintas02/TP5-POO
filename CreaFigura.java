

public class CreaFigura
{
    public static void main(String [] args){
        Punto punto1 = new Punto(5.0, 3.0);
        /*Cuadrado cuadrado1 = new  Cuadrado(10, 10, punto1, 72.99);
        cuadrado1.mostrar()*/;
        
        /*Elipse elipse1 = new Elipse(20.44, 46.86, punto1);
        elipse1.caracteristicas();*/
        
        Circulo circulo1 = new Circulo(7, 20.44, 46.86, punto1);
        circulo1.caracteristicas();
    }
}
