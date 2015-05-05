package primos;

import java.util.ArrayList;

public class GeneradorCompuestos extends ArrayList<Integer> {

   
    
    public Integer dameCompuesto(){
        return 2*((int) (Math.random()*2000));
    }
}
