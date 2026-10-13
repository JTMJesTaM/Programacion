package unidad1;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int apuesta = 0, dinero = 5;
        Scanner teclado = new Scanner(System.in);

        while (dinero > 0) {
            System.out.print("Dinero: " + dinero);
            System.out.print(". Apuesta: ");
            int dado1 = 0, dado2 = 0, tirada1 = 0, tirada2 = 0;
            int sumaAnt = 0, sumaPos = 0;
            apuesta = teclado.nextInt();
            while (apuesta > dinero || apuesta <= 0) {
                System.out.println("Que haces? vuelve a apostar, anda");
                apuesta = teclado.nextInt();
            }
            // Tiramos los dados aleatoriamente y sumamos
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            sumaAnt = dado1 + dado2;

            tirada1 = (int) (Math.random() * 6) + 1;
            tirada2 = (int) (Math.random() * 6) + 1;
            sumaPos = tirada1 + tirada2;

            if (dado1 == dado2)
                sumaAnt = dado1 * 111;
            if (tirada1 == tirada2)
                sumaPos = tirada1 * 111;
            System.out.print("Dealer saca: " + dado1 + ", " + dado2);
            System.out.println(". Sacas: " + tirada1 + ", " + tirada2);
            if (sumaPos < sumaAnt) {
                System.out.println("Pierdes");
                dinero = dinero - apuesta;
            }
            if (sumaAnt < sumaPos) {
                System.out.println("Ganas");
                dinero = dinero + apuesta;
            }
            if (sumaAnt == sumaPos)
                System.out.println("Empate");
        }
        teclado.close();
        System.out.println("No te queda dinero");
    }
}
