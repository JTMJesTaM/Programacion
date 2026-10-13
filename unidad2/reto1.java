package unidad2;

import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Importe total de la cuenta: ");
        String importe = teclado.nextLine();
        Double cuenta = Double.parseDouble(importe);
        System.out.print("Numero de comensales: ");
        String comensales = teclado.nextLine();
        int n_comensales = Integer.parseInt(comensales);
        double pago_individual = cuenta / n_comensales;
        System.out.println("Cada uno tiene que pagar: " + pago_individual);
        teclado.close();
    }
}
