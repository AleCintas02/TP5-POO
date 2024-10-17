
public class CrearPedido
{
    public static void main(String[] args){
        // Se crean objetos Premium y Comun
        Premium premium1 = new Premium(200, 10);
        Premium premium2 = new Premium(200, 7);
        Comun comun1 = new Comun(100, 100);

        // Se crean objetos Renglon que describen los elementos del pedido
        Renglon item1 = new Renglon(7, 2000, premium1);
        Renglon item2 = new Renglon(57, 2000, comun1);
        Renglon item3 = new Renglon(94, 2000, premium2);

        // Se crea un pedido y se agregan los renglones al pedido
        Pedido pedido = new Pedido(item1);
        pedido.agregarRenglon(item2);
        pedido.agregarRenglon(item3);

        // Se muestra el contenido del pedido
        pedido.mostrar();
    }
}
