package primos;

public class Primos {

    public static void main(String[] args) {
        /*UserInterface ui = new CLIUserInterface();
        int m = ui.dameNumeroMuestras();
        int n = ui.dameNumero();*/
        
        
        CalculoPrimo calculoPrimo = null;
        GeneradorPrimos gen = new GeneradorPrimos();
        
        int n,m;
        
        for (int i = 0; i < 25; i++) {
            n=gen.damePrimo();
            m=(int) (Math.random() * n);
            calculoPrimo = new CalculoPrimo(m, n);
            if(calculoPrimo.ejecutar()){
                System.out.println("Se determina que no es primo el número: " +n
                        +"generado por el generador de primos.");
            }else{
                System.out.println(n+" es presuntamente primo.");
            }
        }
        
        GeneradorCompuestos genC = new GeneradorCompuestos();
        for (int i = 0; i < 25; i++) {
            n=genC.dameCompuesto();
            m=(int) (Math.random() * n);
            calculoPrimo = new CalculoPrimo(m, n);
            if(!calculoPrimo.ejecutar()){
                System.out.println("Se determina que no es primo el número: " +n
                        +"generado por el generador de primos.");
            }else{
                System.out.println(n+" es presuntamente primo.");
            }
            
        }
        
    }
    
}
