package unidad2;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el primer lado del triángulo: ");
        int lado1 = Integer.parseInt(sc.nextLine());
        System.out.print("Escribe el segundo lado del triángulo: ");
        int lado2 = Integer.parseInt(sc.nextLine());
        System.out.print("Escribe el tercer lado del triángulo: ");
        int lado3 = Integer.parseInt(sc.nextLine());
        if ((lado1 + lado2 > lado3) || (lado2 + lado3 > lado1) || (lado3 + lado1 > lado2)) {
            System.out.println("Es un triángulo.");
            if (lado1 == lado2 && lado2 == lado3)
                System.out.println("Es equilátero.");
            else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1)
                System.out.println("Es isósceles.");
            else
                System.out.println("Es escaleno.");
            if (((lado1 * lado1) + (lado2 * lado2) == (lado3 * lado3))
                    || ((lado2 * lado2) + (lado3 * lado3) == (lado1 * lado1))
                    || ((lado3 * lado3) + (lado1 * lado1) == (lado2 * lado2))) {
                System.out.println("Es rectángulo.");
            }
        } else
            System.out.println("No es un triángulo.");
        sc.close();
    }
}
