package primos;

import java.math.BigInteger;
import java.util.Random;

public class GeneradorCompuestos{

    private final Random rdn;
    public GeneradorCompuestos() {
        rdn= new Random();
    }

   
    
    public BigInteger dameCompuesto(){
        return new BigInteger(128,(int) Math.random()*128,rdn).multiply(BigInteger.TEN);
    }
}
