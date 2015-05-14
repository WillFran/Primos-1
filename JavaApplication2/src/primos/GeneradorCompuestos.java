package primos;

import java.math.BigInteger;
import java.util.ArrayList;

public class GeneradorCompuestos extends ArrayList<BigInteger> implements GeneradorNúmeros{

    private int index = -1;
    public GeneradorCompuestos() { 
        for (BigInteger bigInteger : new Cargador("compuestos.txt").carga()) {
            this.add(bigInteger);
        }

    }

   
    
    public BigInteger dameSiguiente(){
        index++;
        if(index> this.size()) return null;
        return this.get(index);
    }

    
}
