import java.util.ArrayList;
public class Jardin
{
    String nombre;
    ArrayList<FiguraGeometrica>figuras;

    /**

Constructor for objects of class Jardin
   */
   public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras)
  {
      this.setNombre(p_nombre);
      this.setFiguras(p_figuras);
  }

  public Jardin(String p_nombre)
  {
      this.setNombre(p_nombre);
      this.setFiguras(new ArrayList<FiguraGeometrica>());
  }

  private void setNombre(String p_nombre){
      this.nombre=p_nombre;
  }

  private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
      this.figuras=p_figuras;
  }

  public String getNombre(){
      return this.nombre;
  }
  
  public boolean agregarFigura(FiguraGeometrica p_figura){
      return this.getFiguras().add(p_figura);
  }
  
  public boolean quitarFigura(FiguraGeometrica p_figura){
      return this.getFiguras().remove(p_figura);
  }
  
  public ArrayList<FiguraGeometrica> getFiguras(){
      return this.figuras;
  }
  public double cuantosMetros(){
      double metros= 0;
       for (FiguraGeometrica figura: this.getFiguras()){
        metros += figura.superficie();
       }
       return metros;
  }
  public double cuantosLatas(){
       return Math.ceil(this.cuantosMetros()/20);
    }
  public double cuantosLitros(){
       return this.cuantosMetros()/5;
    }
    
    public void detalleFigura(){
        System.out.println("Presupuesto: " + this.getNombre() + "\n");
        
        for (FiguraGeometrica figura: this.getFiguras()){
        figura.mostrarSuperficie();
       }
        
    }
    
}