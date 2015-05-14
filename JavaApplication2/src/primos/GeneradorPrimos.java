package primos;

import java.math.BigInteger;
import java.util.ArrayList;

public class GeneradorPrimos extends ArrayList<BigInteger> implements GeneradorNúmeros {

    int index = -1;
    public GeneradorPrimos() {
        for (BigInteger bigInteger : new Cargador("primos.txt").carga()) {
            this.add(bigInteger);
        }
 
    }
    
    @Override
    public BigInteger dameSiguiente(){
        index++;
        if(index> this.size()) return null;
        return this.get(index);
    }

    
}
