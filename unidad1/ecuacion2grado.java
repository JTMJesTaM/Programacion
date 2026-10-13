package unidad1;

import java.util.Scanner;

public class ecuacion2grado {
    static void main(String arg[]) {
        int a;
        int b;
        int c;
        double resultado1;
        double resultado2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer número: ");
        a = teclado.nextInt();
        System.out.println("Segundo número: ");
        b = teclado.nextInt();
        System.out.println("Tercer número: ");
        c = teclado.nextInt();
        resultado1 = ((0 - b + (Math.sqrt((b * b) - 4 * a * c))) / (2 * a));
        resultado2 = ((0 + b + (Math.sqrt((b * b) - 4 * a * c))) / (2 * a));
        System.out.println("los resultados son " + resultado1 + " y " + resultado2);
        teclado.close();
    }
}