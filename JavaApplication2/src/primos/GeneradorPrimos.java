package primos;

import java.math.BigInteger;
import java.util.ArrayList;

public class GeneradorPrimos extends ArrayList<BigInteger> {

    public GeneradorPrimos() {
        this.add(BigInteger.ONE);
    }
    
    public BigInteger damePrimo(){
        BigInteger resultado = BigInteger.ONE;
        for (BigInteger primo : this) {
            resultado=resultado.multiply(primo);
        }
        resultado=resultado.add(BigInteger.ONE);
        this.add(resultado);
        return resultado;
    }
    
}
