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
  public ArrayList<FiguraGeometrica> getFiguras(){
      return this.figuras;
  }

}