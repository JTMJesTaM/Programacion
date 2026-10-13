package unidad1;

import java.util.Scanner;

public class areacirculo {
    public static void main(String[] args) {
        float resultado = 8f;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cual es el radio?");
        float radio = keyboard.nextFloat();
        resultado = (float) Math.PI * radio * radio;
        System.out.println(resultado);
    }
}
