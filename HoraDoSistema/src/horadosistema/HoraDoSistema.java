
package horadosistema;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author igora
 */
public class HoraDoSistema {

    public static void main(String[] args) {
     Locale loc = Locale.getDefault();
     Date relogio = new Date();
        System.out.println("A hora do sistema e:" );
        System.out.println(relogio.toString());
        System.out.println("O Idioma do sistema e:");
        System.out.println(loc.toString());
     
    }    

  
}
