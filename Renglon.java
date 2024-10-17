
public class Renglon
{   
    private int cantidad;
    private double importe;
    private Etiqueta item;
    
    public Renglon(int p_cantidad, double p_importe, Etiqueta p_item)
    {
       this.setCantidad(p_cantidad);
       this.setImporte(p_importe);
       this.setItem(p_item);
    }
    
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    private void setImporte(double p_importe){
        this.importe = p_importe;       
    }
    private void setItem(Etiqueta p_item){
    this.item = p_item;       
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    public double getImporte(){
        return this.importe;
    }
    public Etiqueta getItem(){
        return this.item;
    }
    
    public void mostrar(){
        System.out.println(this.getCantidad() + " Etiquetas de tipo " + this.getItem().toString());
    }

}
