
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


    public int converte(String numeroEmRomano) {
        int acumulador = 0;
        int ultimoVisinhoDaDireita = 0;
        
        for(int i = numeroEmRomano.length() - 1; i >= 0 ; i--){
            int atual = tabela.get(numeroEmRomano.charAt(i));
            
            int multiplicador = 1;
            
            if(atual < ultimoVisinhoDaDireita) {
                multiplicador = -1;
            }
            
            acumulador += atual * multiplicador;
            
            ultimoVisinhoDaDireita = atual;
        }
        return acumulador;
        
    }
    
    
}
