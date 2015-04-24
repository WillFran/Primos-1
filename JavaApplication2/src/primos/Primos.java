package primos;

public class Primos {

    public static void main(String[] args) {
        UserInterface ui = new CLIUserInterface();
        int m = ui.dameNumeroMuestras();
        int n = ui.dameNumero();
        CalculoPrimo calculoPrimo = new CalculoPrimo(m, n);
    }
    
}
