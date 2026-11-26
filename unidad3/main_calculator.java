package unidad3;

import java.util.Scanner;

public class main_calculator {
    public static void main(String[] args) {
        String funcion;
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("Numero 2: ");
        double num2 = Double.parseDouble(sc.nextLine());
        do {
            System.out.print("Qué operación quieres hacer? ");
            funcion = sc.nextLine().toLowerCase();
        } while (!funcion.equals("sumar") && !funcion.equals("restar")
                && !funcion.equals("multplicar") && !funcion.equals("dividir")
                && !funcion.equals("potencia"));
        switch (funcion) {
            case "sumar":
                System.out.println(calc.sumar(num1, num2));
                break;
            case "restar":
                System.out.println(calc.restar(num1, num2));
                break;
            case "multiplicar":
                System.out.println(calc.multiplicar(num1, num2));
                break;
            case "dividir":
                System.out.println(calc.dividir(num1, num2));
                break;
            case "potencia":
                System.out.println(calc.potencia(num1, num2));
                break;
        }
        sc.close();
    }
}
