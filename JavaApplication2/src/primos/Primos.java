package primos;

public class Primos {

    public static void main(String[] args) {
        /*UserInterface ui = new CLIUserInterface();
        int m = ui.dameNumeroMuestras();
        int n = ui.dameNumero();*/
        
        
        CalculoPrimo calculoPrimo = null;
        GeneradorPrimos gen = new GeneradorPrimos();
        
        int n,m;
        
        System.out.println("PRUEBAS DE PRIMOS----------------------");
        for (int i = 0; i < 6; i++) {
            n=gen.damePrimo();
            m=(int) (Math.random() * n)+1;
            calculoPrimo = new CalculoPrimo(m, n);
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
                System.out.println("Se determina que no es compueso el número: " +n
                        +"generado por el generador de compuestos.");
            }else{
                System.out.println(n+" es compuesto.");
            }
            
        }
        
    }
    
}
