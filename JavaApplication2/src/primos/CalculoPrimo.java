package primos;

import java.util.ArrayList;
import java.util.Iterator;

public class CalculoPrimo {

    private final int m, n;
    private ConjuntoMuestrasNumeros b;
    private final ArrayList<Integer> conjuntoKs;

    public CalculoPrimo(int m, int n) {
        this.m = m;
        this.n = n;
        b = new ConjuntoMuestrasNumeros(m, n);
        conjuntoKs = calculaConjuntoKs();
    }

    public boolean ejecutar() {
        for (Integer bi : b) {
            if (Math.pow(bi, n-1) % n != 1) {
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

    private boolean evaluaCondicionCompuesta(Integer bi) {
        Iterator<Integer> iterador = conjuntoKs.iterator();
        boolean resultado = false;
        while (iterador.hasNext()){ //en conjuntoKs se guardan los valores de k que cumplen la condicion primera
            Integer k = iterador.next();
            resultado = segundaCondicion(bi,k); //por tanto sólo hay que comprobar la segunda condicion
        }
        return resultado;
    }

    private boolean segundaCondicion(Integer bi, Integer k) {
        return (1 < mcd((int)Math.pow(bi,k),n) && mcd((int)Math.pow(bi,k),n) < n);
    }

    private int mcd(int a, int b) {
        if(b==0)
           return a;
       else
           return mcd(b, a % b);
    }
    
    private ArrayList<Integer> calculaConjuntoKs() {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 1; i < n - 1; i++) {
            if (cumpleFuncion(i)) {
                resultado.add((int) ((n-1)/Math.pow(2d,i)) );
            }
        }
        return resultado;
    }

    private boolean cumpleFuncion(int i) {
        return (n-1)%Math.pow(2d,i) == 0;
    }

}
