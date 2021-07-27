
package dominio;

import java.util.ArrayList;


public class Universidad {
    private String nombreUniversidad;
    private ArrayList<Facultad> facultades;
    
    public Universidad(String nombreUniversidad,ArrayList<Facultad> facultades ){
        this.facultades=facultades;
        this.nombreUniversidad=nombreUniversidad;
    }
}

