package primos;

import java.util.ArrayList;

public class CalculoPrimo {

    private final int m, n;
    private ConjuntoMuestrasNumeros b;
    private final ArrayList<Integer> conjuntoJs;

    public CalculoPrimo(int m, int n) {
        this.m = m;
        this.n = n;
        b = new ConjuntoMuestrasNumeros(m, n);
        conjuntoJs = calculaConjuntoJs();
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
    }

    private boolean evaluaCondicionCompuesta(Integer bi) {
        return (primeraCondicion() && segundaCondicion(bi));
    }

    private boolean primeraCondicion() {
        return conjuntoJs.size() > 0;
    }

    private ArrayList<Integer> calculaConjuntoJs() {
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 1; i < n - 1; i++) {
            if (cumpleFuncion(i)) {
                resultado.add(i);
            }
        }
        return resultado;
    }

    private boolean cumpleFuncion(int i) {
        return (n-1)%Math.pow(2d,i) == 0;
    }
}
