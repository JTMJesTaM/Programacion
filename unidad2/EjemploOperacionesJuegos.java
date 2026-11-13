package unidad2;

import java.util.Scanner;

public class EjemploOperacionesJuegos {
    public static void main(String[] args) {
        String nombreVideojuego = "", categoria = "", nombreMaxPunt = "", nombreMinPunt = "";
        double puntuacion = 0, precio = 0, precioTotal = 0, mayorPuntuacion = Double.MIN_VALUE,
                menorPuntuacion = Double.MAX_VALUE;
        int cantPuntuacionAlta = 0, cantZeldaAventura = 0, n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos videojuegos hay?");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Introduce el nombre del videojuego numero " + i + ": ");
            nombreVideojuego = sc.nextLine();
            System.out.println("Introduce la puntuación del videojuego numero " + i + ": ");
            puntuacion = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce el precio del videojuego numero " + i + ": ");
            precio = Double.parseDouble(sc.nextLine());
            System.out.println("Introduce la categoría del videojuego numero " + i + ": ");
            categoria = sc.nextLine();
            if (puntuacion > 9)
                cantPuntuacionAlta++;

            if (categoria.equalsIgnoreCase("aventura") && nombreVideojuego.contains("zelda"))
                cantZeldaAventura++;

            precioTotal = precioTotal + precio;

            if (puntuacion > mayorPuntuacion) {
                mayorPuntuacion = puntuacion;
                nombreMaxPunt = nombreVideojuego;
            }

            if (puntuacion < menorPuntuacion) {
                menorPuntuacion = puntuacion;
                nombreMinPunt = nombreVideojuego;
            }
        }
        System.out.println("La cantidad de juegos con puntuación mayor a 9 es " + cantPuntuacionAlta);
        System.out.println("La cantidad de videojuegos de aventura de Zelda son " + cantZeldaAventura);
        System.out.println("Todos los juegos juntos cuestan " + precioTotal + " euros");
        System.out.println("La mayor puntuación es " + mayorPuntuacion);
        System.out.println("La menor puntuación es " + menorPuntuacion);
        System.out.println("El videojuego con mayor puntuación es " + nombreMaxPunt);
        System.out.println("El videojuego con menor puntuación es " + nombreMinPunt);
        sc.close();
    }
}
