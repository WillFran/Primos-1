package primos;

import java.util.Scanner;

public class CLIUserInterface implements UserInterface {

    @Override
    public int dameNumero() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println("¿Qué número quieres comprobar que es primo?");
        respuesta = teclado.nextInt();
        return respuesta;
    }

    @Override
    public int dameNumeroMuestras() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        System.out.println("¿Cuántas muestras tengo que utilizar?");
        respuesta = teclado.nextInt();
        return respuesta;
        
    }
}
