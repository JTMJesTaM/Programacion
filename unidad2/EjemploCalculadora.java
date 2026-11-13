package unidad2;

import java.util.Scanner;

public class EjemploCalculadora {
    public static void main(String[] args) {
        double num1, num2, resultado = 0;
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("    1- Suma\r\n" +
                    "   2- Resta\r\n" +
                    "   3- División\r\n" +
                    "   4- Multiplicación\r\n" +
                    "   5- Salir\r\n" +
                    "Elige una opción(1-5): ");

            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Introduce el primer número: ");
                num1 = sc.nextDouble();
                System.out.println("Introduce el segundo número: ");
                num2 = sc.nextDouble();
            }
            // no finalizado
            switch (opcion) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 / num2;
                case 4 -> resultado = num1 * num2;
                case 5 -> System.out.println("Adióh");
                default -> System.out.println("Opción no válida, introduce una opción entre 1 y 5 brou");
            }
            System.out.println("El resultado de la operación es " + resultado);
        } while (opcion != 5);
        sc.close();
    }
}
