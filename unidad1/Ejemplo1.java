package unidad1;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String args[]) {
        String nombre = ".";
        int edad = 0;
        String BienVestido = ".";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vienes bien vestido?");
        BienVestido = teclado.next();
        System.out.println("Tu nombre?");
        nombre = teclado.next();
        if (BienVestido.equals("si"))
            System.out.println("Vienes bien vestido, " + nombre);
        if (BienVestido.equals("no"))
            System.out.println("No vienes bien vestido, " + nombre);
        System.out.println("Y cuantos años tienes?");
        edad = teclado.nextInt();
        System.out.println("Wow, tienes " + edad + " años");
        teclado.close();
        if ((BienVestido.equalsIgnoreCase("si") && edad >= 18) || nombre.equalsIgnoreCase("Javi"))
            System.out.println("Entra tio");
        else
            System.out.println("Fuera tio");

    }
}