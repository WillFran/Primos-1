package primos;

import java.util.HashSet;

public class ArbolNumeros extends HashSet<Integer>{
    
    public ArbolNumeros (int m, int n){
        for (int i = 0; i < m; i++) {
            while (!this.add((int) (Math.random() * n))){};
        }
    }
    
    public Integer dameNumero(){
        if (this.iterator().hasNext()) return this.iterator().next();
        return null;
    }
}
