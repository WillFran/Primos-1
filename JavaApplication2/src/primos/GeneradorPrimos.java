package primos;

import java.util.ArrayList;

public class GeneradorPrimos extends ArrayList<Integer> {

    public GeneradorPrimos() {
        this.add(1);
    }
    
    public Integer damePrimo(){
        int resultado = 1;
        for (Integer primo : this) {
            resultado*=primo;
        }
        resultado+=1;
        this.add(resultado);
        return resultado;
    }
    
}
