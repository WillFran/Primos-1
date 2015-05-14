package primos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Cargador {

    private BufferedReader lector = null;

    public Cargador(String ruta) {
        try {
            this.lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        }
    }

    public ArrayList<BigInteger> carga() {
        ArrayList<BigInteger> resultado = new ArrayList<>();
        String line = leerLinea();
        String[] lineaPartida;
        while (line != null) {
            if ((line.length() > 0) && (line.charAt(0) != '#')) {
                lineaPartida = line.split(" ");
                for (String string : lineaPartida) {
                    resultado.add(new BigInteger(string.trim()));
                }
            }
            line = leerLinea();
        }
        return resultado;
    }

    private String leerLinea() {
        String line;
        try {
            line = lector.readLine();
        } catch (IOException ex) {
            line = null;
        }
        return line;
    }
}
