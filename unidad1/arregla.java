package unidad1;

import java.util.Scanner;

public class arregla {
    static void main(String arg[]) {
        int numero1;
        int numero2;
        int numero3;
        Scanner teclado = new Scanner(System.in);
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();
        numero3 = teclado.nextInt();
        System.out.println("La media es: " + ((numero1 + numero2 + numero3) / 3));
        teclado.close();
    }
}