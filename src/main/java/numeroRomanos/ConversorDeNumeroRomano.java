
package numeroRomanos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author valeria
 */

public class ConversorDeNumeroRomano {
    private static  Map<Character, Integer> tabela = new HashMap<Character,Integer>(){
        {
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }
    };


    public int converte(String numeroERomano) {
        int acumulador = 0;
        for(int i = 0; i<numeroERomano.length();i++){
            acumulador += tabela.get(numeroERomano.charAt(i));
        }
        return acumulador;
        
    }
    
    
}
