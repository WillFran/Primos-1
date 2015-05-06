package primos;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;

public class ConjuntoMuestrasNumeros extends HashSet<BigInteger>{
    
    public ConjuntoMuestrasNumeros (int m, BigInteger n){
        Random rnd = new Random();
        for (int i = 0; i < m; i++) {
            /*La probabilidad de que el BigInteger creado sea un número primo depende del Math.random
            1-1/2^(segundo parámetro)*/
            while (!this.add(new BigInteger(128,(int)(Math.random()),rnd))){};
        }
    }
    
    public BigInteger dameNumero(){
        if (this.iterator().hasNext()) return this.iterator().next();
        return null;
    }
}
