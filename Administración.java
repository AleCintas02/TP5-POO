

public class Administración
{
   public static void main(String []args){
       Punto punto1 = new  Punto(3.0, 2.0);
       Punto punto2 = new  Punto(6.0, 3.0);
       Punto punto3 = new  Punto(5.2, 2.7);
       Punto punto4 = new  Punto(2.2, 1.7);
       
       
       Cuadrado cuadrado = new Cuadrado(1, 1, punto1, 1);
       Triangulo triangulo = new Triangulo(punto2, 1, 1);
       Circulo circulo = new Circulo(5.0, 34, 45, punto3);
       Elipse elipse = new Elipse(3, 7, punto4);
       
       Jardin jardin = new Jardin("Bichito de Luz");
       
       jardin.agregarFigura(cuadrado);
       jardin.agregarFigura(triangulo);
       jardin.agregarFigura(circulo);
       jardin.agregarFigura(elipse);
       
       System.out.println("Total a cubrir: " + jardin.cuantosMetros());
       System.out.println("Latas: " + jardin.cuantosLatas());
       
              
   }
}
