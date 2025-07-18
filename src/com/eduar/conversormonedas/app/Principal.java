package com.eduar.conversormonedas.app;

import com.eduar.conversormonedas.service.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("****************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println();
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println();
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    double cantidadUSD1 = leerNumero(sc, "Ingrese cantidad en USD: ");
                    Conversor.convertir("USD", "ARS", cantidadUSD1);
                    break;
                case 2:
                    double cantidadARS = leerNumero(sc, "Ingrese cantidad en ARS: ");
                    Conversor.convertir("ARS", "USD", cantidadARS);
                    break;
                case 3:
                    double cantidadUSD2 = leerNumero(sc, "Ingrese cantidad en USD: ");
                    Conversor.convertir("USD", "BRL", cantidadUSD2);
                    break;
                case 4:
                    double cantidadBRL = leerNumero(sc, "Ingrese cantidad en BRL: ");
                    Conversor.convertir("BRL", "USD", cantidadBRL);
                    break;
                case 5:
                    double cantidadUSD3 = leerNumero(sc, "Ingrese cantidad en USD: ");
                    Conversor.convertir("USD", "COP", cantidadUSD3);
                    break;
                case 6:
                    double cantidadCOP = leerNumero(sc, "Ingrese cantidad en COP: ");
                    Conversor.convertir("COP", "USD", cantidadCOP);
                    break;
                case 7:
                    System.out.println("Saliendo del conversor...");
                    break;
                default:
                    System.out.println("Ingrese un número válido");
                    break;
            }
            System.out.println("****************************************");

        } while (opcion != 7);

        sc.close();
    }

    public static double leerNumero(Scanner sc, String mensaje) {
        double numero = 0;

        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                numero = sc.nextDouble();
                break;
            } else {
                System.out.println("Entrada no válida. Intente nuevamente.");
                sc.next();
            }
        }

        return numero;
    }

}

