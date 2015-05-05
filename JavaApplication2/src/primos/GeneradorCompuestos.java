package primos;

import java.util.ArrayList;

public class GeneradorCompuestos extends ArrayList<Integer> {

    public GeneradorCompuestos() {
        this.add((int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public Integer dameCompuesto(){
        int resultado = 1;
        this.add((int) (Math.random() * Integer.MAX_VALUE));
        for (Integer comp : this) {
            resultado *=comp;
        }
        return resultado;
    }
}
