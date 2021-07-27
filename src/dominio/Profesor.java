
package dominio;

import java.util.ArrayList;

public class Profesor {
  private String nombreprofesor;
  private ArrayList<Materia> materias;
  
  public Profesor(String nombre,ArrayList<Materia> materias){
      this.materias=materias;
      this.nombreprofesor=nombreprofesor;
  }
}
