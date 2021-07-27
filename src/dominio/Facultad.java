
package dominio;

import java.util.ArrayList;

public class Facultad implements Comparable<Facultad>{
  private String nombrefacultad;
  private Director directores;
  private ArrayList<Carrera> carreras= new ArrayList<>();
  private ArrayList<Profesor> profesores=new ArrayList<>();

   public Facultad(String nombrefacultad,Director directores,ArrayList<Carrera> carreras,ArrayList<Profesor> profesores){
       this.carreras=carreras;
       this.directores=directores;
       this.nombrefacultad=nombrefacultad;
       this.profesores=profesores;
   }
    @Override
    public int compareTo(Facultad o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
