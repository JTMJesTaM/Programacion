package unidad2;

import java.util.Scanner;

public class caliente {

    private static final int NUM_INTENTOS = 4;
    private static final int DISTANCIA = 8;

    public static void main(String[] args) {

        int numUsuario, numIntentos = NUM_INTENTOS, numBuscar;
        Scanner teclado = new Scanner(System.in);

        numBuscar = (int) (Math.random() * 100 + 1);

        System.out.println("Escribe un número del 1 al 100, te quedan " + numIntentos + " intentos: ");
        numUsuario = teclado.nextInt();

        if (numUsuario < numBuscar)
            System.out.println("mayor");
        else if (numUsuario > numBuscar)
            System.out.println("menor");
        else {
            System.out.println("primer intento q suerte");
            teclado.close();
            return;
        }
        if (Math.abs(numBuscar - numUsuario) < DISTANCIA)
            System.out.println("cerca");
        numIntentos--;

        System.out.println("Escribe un número del 1 al 100, te quedan " + numIntentos + " intentos: ");
        numUsuario = teclado.nextInt();

        if (numUsuario < numBuscar)
            System.out.println("mayor");
        else if (numUsuario > numBuscar)
            System.out.println("menor");
        else {
            System.out.println("you got it");
            teclado.close();
            return;
        }
        if (Math.abs(numBuscar - numUsuario) < DISTANCIA)
            System.out.println("cerca");
        numIntentos--;

        System.out.println("Escribe un número del 1 al 100, te quedan " + numIntentos + " intentos: ");
        numUsuario = teclado.nextInt();

        if (numUsuario < numBuscar)
            System.out.println("mayor");
        else if (numUsuario > numBuscar)
            System.out.println("menor");
        else {
            System.out.println("you got it");
            teclado.close();
            return;
        }
        if (Math.abs(numBuscar - numUsuario) < DISTANCIA)
            System.out.println("cerca");
        numIntentos--;

        System.out.println("Escribe un número del 1 al 100, last chance");
        numUsuario = teclado.nextInt();

        if (numUsuario < numBuscar)
            System.out.println("mayor");
        else if (numUsuario > numBuscar)
            System.out.println("menor");
        else {
            System.out.println("you got it");
            teclado.close();
            return;
        }
        if (Math.abs(numBuscar - numUsuario) < DISTANCIA)
            System.out.println("cerca");
        numIntentos--;

        System.out.println("Te quedaste sin intentos malo");

        teclado.close();
    }
}
