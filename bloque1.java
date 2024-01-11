package javaapplication1;

import java.util.Scanner;

public class bloque1 {


    public static void main(String[] args) {
        int menu;
        do { 
            Scanner sc = new Scanner(System.in);
            menu = menu();
            switch (menu) {
                case 0:
                    System.exit(menu);
                    break;
                case 1:
                    System.out.println("Digame el numero en decimal");
                    int decimal = sc.nextInt();
                    decimalBinario(decimal);
                    break;
                case 2:
                    System.out.println("Digame el numero en Binario");
                    long binario = sc.nextLong();
                    binarioDecimal(binario);
                    break;
                case 3:
                    System.out.println("Digame el numero y te dire su es par o no");
                    int numero = sc.nextInt();
                    System.out.println(esParell(numero));
                    break;
                case 4:
                    System.out.println("Digame el numero");
                    int numero2 = sc.nextInt();
                    primersNombresParells(numero2);
                    break;
                default:
                    System.out.println("Opción Invalida");
                    menu = menu();
            }
            sc.close();
        } while (menu != 0); 
    }

    public static void decimalBinario(int decimal) {
        // Imprime cifra por cifra convirtiendolo en 0 o 1 según toque
        while (decimal > 0) {
            System.out.println(decimal % 2);
            decimal /= 2;
        }
    }

    public static void binarioDecimal(long numero) {
        int resultado = 0;
        int longitud = 0;
        long copia = numero;

        // Calcular la longitud del número binario
        while (copia > 0) {
            longitud++;
            copia /= 10;
        }

        // Restaurar el valor original de copia, así podemos conservar la varible numero
        // intacta
        copia = numero;

        // Convertir el número binario a decimal
        for (int i = 0; i < longitud; i++) {
            long digito = copia % 10;
            resultado += digito * Math.pow(2, i);
            copia /= 10;
        }

        System.out.println("El número en decimal es: " + resultado);
    }

    public static boolean esParell(int numero) {

        // Si el numero es par entra en el if y devuelve el true, sino devuelve false
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void primersNombresParells(int numero) {

        // Recorre todos los numeros de 0 a numero, y todos los que sean par se imprimen
        // por pantalla
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Tria una de les següents opcions:
                1. Decimal a binari
                2. Binari a decimal
                3. És parell?
                4. Calcular parells de 0 fins a n
                0. Sortir""");
        int menu = sc.nextInt();
        sc.close();
        return menu;
    }

}