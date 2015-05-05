package primos;

public class Primos {

    public static void main(String[] args) {
                
        CalculoPrimo calculoPrimo = null;
        GeneradorPrimos gen = new GeneradorPrimos();
        
        int n,m;
        
        System.out.println("PRUEBAS DE PRIMOS----------------------");
        for (int i = 0; i < 6; i++) {
            n=gen.damePrimo();
            m=(int) (Math.random() * n)+1;
            calculoPrimo = new CalculoPrimo(m, n);
            System.out.println("Probabilidad de acierto: " + (1-1/Math.pow(2, m)));
            if(calculoPrimo.ejecutar()){
                System.out.println("Se determina que no es primo el número: " +n
                        +"generado por el generador de primos.");
            }else{
                System.out.println(n+" es presuntamente primo.");
            }
        }
        
        System.out.println("PRUEBA DE COMPUESTOS---------------------");
        GeneradorCompuestos genC = new GeneradorCompuestos();
        for (int i = 0; i < 6; i++) {
            n=genC.dameCompuesto();
            m=(int) (Math.random() * n);
            calculoPrimo = new CalculoPrimo(m, n);
            if(!calculoPrimo.ejecutar()){
                System.out.println("Se determina que es compueso el número: " +n
                        +"generado por el generador de compuestos.");
            }else{
                System.out.println(n+" es compuesto.");
            }
            
        }
        
    }
    
}
