import java.util.ArrayList;

public class Pedido
{
    private ArrayList<Renglon> renglones;

    
    public Pedido(ArrayList<Renglon> p_renglones)
    {
       this.setRenglones(p_renglones);
    }
    
    public Pedido(Renglon p_renglon)
    {
       this.setRenglones(new ArrayList<>());
       this.agregarRenglon(p_renglon);
    }
    
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    public void agregarRenglon(Renglon p_renglon){
        this.getRenglones().add(p_renglon);
    }
    
    public void eliminarRenglon(Renglon p_renglon){
        this.getRenglones().remove(p_renglon);
    }
    
    public void mostrar(){
        int i = 0, cantidadPedido = 0;
        double importeTotal = 0;
        
        System.out.println("Pedido:\nCantidad de items: " + this.getRenglones().size());
        
        for(Renglon renglon : this.getRenglones()){
            i++;
            int renglonCantidad = renglon.getCantidad();
            double renglonPrecio = renglon.getItem().precio(renglonCantidad);
            
            System.out.print("Item " + i + ": "); renglon.mostrar();
            System.out.println("Precio: $" + renglonPrecio);
            
            cantidadPedido += renglon.getCantidad();
            importeTotal += renglonPrecio;
        }
        
        System.out.println("--- Total pedido: " + cantidadPedido + " Etiquetas por un importe total de: $" + importeTotal);
    }
    
    
    

   
}
