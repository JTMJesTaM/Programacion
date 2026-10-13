package unidad1;

import java.util.Scanner;

public class Hacienda {
    public static void main(String[] args) {
        double dinero = 1.2;
        double hacienda = 2.1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cual es tu sueldo bruto?");
        double sueldo = keyboard.nextFloat();
        System.out.println("Cual es el porcentaje de los impuestos que pagas?");
        double impuestos = keyboard.nextFloat();
        hacienda = sueldo * impuestos / 100;
        dinero = sueldo - hacienda;
        System.out.println("Cobras " + sueldo + " pero hacienda se lleva " + hacienda
                + " por lo cual te quedan unos miseros " + dinero);
        keyboard.close();
    }
}