import java.util.ArrayList;
public class Jardin
{
    String nombre;
    ArrayList<FiguraGeometrica>figuras;
<<<<<<< HEAD

    /**
     
Constructor for objects of class Jardin
   */
   public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras)
  {
      this.setNombre(p_nombre);
      this.setFiguras(p_figuras);
  }
=======
        /**
         
    Constructor for objects of class Jardin 
       */
       public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras)
      {
          this.setNombre(p_nombre);
          this.setFiguras(p_figuras);
      }
  
>>>>>>> 10363a46e66d38082dff927b0c921af5814dde05
  public Jardin(String p_nombre)
  {
      this.setNombre(p_nombre);
      this.setFiguras(new ArrayList<FiguraGeometrica>());
  }
// hola esto es un comentario generico creado por IA
  private void setNombre(String p_nombre){
      this.nombre=p_nombre;
  }
  
  //setFiguras
  private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
      this.figuras=p_figuras;
  }

  public String getNombre(){
      return this.nombre;
  }
  public ArrayList<FiguraGeometrica> getFiguras(){
      return this.figuras;
  }
<<<<<<< HEAD

}
=======
}
>>>>>>> 10363a46e66d38082dff927b0c921af5814dde05
