package primos;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class CalculoPrimo {

    private final static BigInteger dos = BigInteger.ONE.add(BigInteger.ONE);
    private final BigInteger n;
    private final int m;
    private ConjuntoMuestrasNumeros b;
    private final ArrayList<BigInteger> conjuntoKs;

    public CalculoPrimo(int m,BigInteger n) {
        this.m = m;
        this.n = n;
        b = new ConjuntoMuestrasNumeros(m, n);
        conjuntoKs = calculaConjuntoKs();
    }

    public boolean ejecutar() {
        for (BigInteger bi : b) {
            if (!bi.modPow(n.subtract(BigInteger.ONE), n).equals(BigInteger.ONE)) {
                return false;
            }

            //TODO:Obtener el conjunto de todas los exponentes que dan como
            //Resultado a la expresión (n-1)/2^j un número entero
            if (evaluaCondicionCompuesta(bi)) {
                return false;
            }
        }
        return true;
    }

    private boolean evaluaCondicionCompuesta(BigInteger bi) {
        Iterator<BigInteger> iterador = conjuntoKs.iterator();
        boolean resultado = false;
        while (iterador.hasNext() && !resultado){ //en conjuntoKs se guardan los valores de k que cumplen la condicion primera
            BigInteger k = iterador.next();
            resultado = segundaCondicion(bi,k); //por tanto sólo hay que comprobar la segunda condicion
        }
        return resultado;
    }

    private boolean segundaCondicion(BigInteger bi, BigInteger k) {
        return compruebaLimiteInferiorIntervalo(bi, k.intValue()) && 
                compruebaLimiteSuperiorIntervalo(bi, k.intValue());
    }

    private BigInteger mcd(BigInteger a, BigInteger b) {
        if(b.equals(BigInteger.ZERO))
           return a;
       else
           return mcd(b, a.mod(b));
    }
    
    private ArrayList<BigInteger> calculaConjuntoKs() {
        ArrayList<BigInteger> resultado = new ArrayList<>();
        
        BigInteger ref = BigInteger.TEN.pow(100);
        
        for (int j = 1; j < n.intValue() - 1; j++) {
            if (cumpleFuncion(j)) {
                resultado.add(
                      n.subtract(BigInteger.ONE).divide(dos.pow(j))
                       );
            }
            if (j % 1000 == 1 && n.compareTo(ref) > 0) 
                System.out.println("Calulando conjunto de las k último intento fue:" + j);
        }
        return resultado;
    }

    private boolean cumpleFuncion(int i) {
        return n.subtract(BigInteger.ONE).mod(dos.pow(i)).equals(BigInteger.ZERO);
    }

    private boolean compruebaLimiteInferiorIntervalo(BigInteger bi, int k){
        return mcd(bi.pow(k).subtract(BigInteger.ONE),n).compareTo(BigInteger.ONE)>0;
    }
    
    private boolean compruebaLimiteSuperiorIntervalo(BigInteger bi, int k){
        return mcd(bi.pow(k).subtract(BigInteger.ONE),n).compareTo(n)<0;
    }
}