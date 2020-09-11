package teste;




import numeroRomanos.ConversorDeNumeroRomano;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author valeria
 */

public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deveEntenderOSimboloI(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        assertEquals(5, numero);
    }
    
    @Test 
    public void deveEntenderOSimboloII(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        assertEquals(2, numero);
    }
}