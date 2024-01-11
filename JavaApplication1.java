package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        // Declaramos la variable numero
        int numero;

        // Solicitamos el número al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número de 0 a 99: ");
        numero = scanner.nextInt();

        // Convertimos el número a texto
        String texto = "";
        String[] decenas = {"cero", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] diecis = {"cero", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
        
        if (numero < 10) {
            texto += unidades[numero];
        } else if (numero > 10 && numero < 20) {
            texto += diecis[numero % 10];
        } else if (numero % 10 == 0){
            texto += decenas[numero / 10];
        } else {
            texto += decenas[numero / 10] + " y " + unidades[numero % 10];
        }

        // Imprimimos el número escrito
        System.out.println("El número " + numero + " escrito es: " + texto);
    }
}
