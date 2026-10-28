package unidad2;

import java.util.Scanner;

public class Ejerciciopares {
    public static void main(String[] args) {
        /*
         * Contar todos los numeros pares hasta el numero que se intoduzca o el 100
         * Excepto el 8. Odiamos el 8
         */
        // int i = 0;
        int n;
        String nStr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        nStr = sc.nextLine();
        n = Integer.parseInt(nStr);
        /*
         * while (i <= n) {
         * if ((i % 2) == 0) POSIBILIDAD 1
         * System.out.println(i);
         * i++;
         * }
         */ for (int j = 0; j <= n; j = j + 2) {
            if (j == 8)
                continue;
            if (j == 100)
                break;
            System.out.println(j);
        }
        sc.close();
    }
}
