
package dominio;

import java.util.ArrayList;

public class Materia {
  private String nombremateria;
  private int nrc;
  private ArrayList<Estudiante> estudiantes;
  
  public Materia(String nombremateria,int nrc,ArrayList<Estudiante> estudiantes){
      this.estudiantes=estudiantes;
      this.nombremateria=nombremateria;
      this.nrc=nrc;
  }
}
