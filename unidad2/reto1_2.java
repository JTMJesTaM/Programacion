package unidad2;

import java.util.Scanner;

public class reto1_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador1");
        String jugador1 = leer.nextLine().toLowerCase().trim();
        System.out.println("Jugador2");
        String jugador2 = leer.nextLine().toLowerCase().trim();
        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else if (jugador1.equals("piedra")) {
            if (jugador2.equals("papel"))
                System.out.println("Gana Jugador2");
            else
                System.out.println("Gana Jugador1");
        } else if (jugador1.equals("papel")) {
            if (jugador2.equals("tijera"))
                System.out.println("Gana Jugador2");
            else
                System.out.println("Gana Jugador1");
        } else if (jugador1.equals("tijera")) {
            if (jugador2.equals("piedra"))
                System.out.println("Gana Jugador2");
            else
                System.out.println("Gana Jugador1");
        }
    }
}
