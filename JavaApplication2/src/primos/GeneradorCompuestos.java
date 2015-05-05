package primos;

import java.util.ArrayList;

public class GeneradorCompuestos extends ArrayList<Integer> {

    public GeneradorCompuestos() {
        this.add((int) (Math.random() * Integer.MAX_VALUE));
    }
    
    public Integer dameCompuesto(){
        return 2*(int) (Math.random() * Integer.MAX_VALUE);
    }
}
