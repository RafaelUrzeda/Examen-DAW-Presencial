package javaapplication1;

import java.util.Scanner;

public class bloque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        float centimetrosRadio;
        float longitdCisterna;
        float metrosCubicos;
        double volumen;
        float volumenM2;
        int viajes;

        // Imprime un pequeño menu y luego pregunta la elección hasta que el usuario
        // introduzca una valida
        do {
            System.out.println("""
                    Què has de transportar?
                    1. Líquids
                    2. Sòlids""");
            eleccion = sc.nextInt();
            if (eleccion != 1 && eleccion != 2) {
                System.out.println("No és una opció vàlida");
            }
        } while (eleccion != 1 && eleccion != 2);

        // Pregunta y recoge cada variable necesaria
        System.out.println("Quants centimetres té la cisterna?");
        centimetrosRadio = sc.nextFloat();

        System.out.println("Quants centímetres de longitud té la cisterna?");
        longitdCisterna = sc.nextFloat();

        System.out.println("Quants metres cúbics hem de transportar?");
        metrosCubicos = sc.nextFloat();
        sc.close();

        // Calculamos el volumen utilizando la función volumCilindre
        volumen = volumCilindre(centimetrosRadio, longitdCisterna);
        volumenM2 = (float) volumen / 1000000;
        System.out.println("El camió té capacitat per " + volumen + " centímetres cúbics\n" +
                "Hi caben " + volumenM2 + " metres cúbics.");

        //Calculamos cuantos vijes debe hacer y informamos al usuario
        viajes = (int) Math.ceil(metrosCubicos/volumenM2);
        System.out.println("Has de fer " + viajes + " viatges");


    }

    public static double volumCilindre(float radio, float longitud) {
        // Aplicamos la fórmula correspondiente y devolvemos el resultado
        double volumen = Math.PI * Math.pow(radio, 2) * longitud;
        return volumen;
    }

    public static double volumPrismaRectangular(float costat1, float costat2, float costat3) {
        // Aplicamos la formula correspondiente y devolvemos el resultado
        double volumen = costat1 * costat2 * costat3;
        return volumen;
    }
}
