package unidad2;

import java.util.Scanner;

public class EjemploFuncionesString {

    public static void main(String[] args) {
        int edad = 18;
        String modeloCoche = " Corsa ", frase = "";
        Scanner teclado = new Scanner(System.in);

        // arregla espacios al inicio y fin
        modeloCoche = modeloCoche.trim();

        System.out.print("Introduce una frase: ");
        frase = teclado.nextLine();

        // Para saber la cantidad de caracteres que tiene un String se usa la funcion
        // length()
        System.out.println("El modelo de coche tiene " + modeloCoche.length() + " caracteres");

        /**
         * Con tolowercase se pasa a minusculas y con touppercase se pasa a mayusculas
         */
        System.out
                .println("En mayusculas " + modeloCoche.toUpperCase() + " en minusculas " + modeloCoche.toLowerCase());

        // Para sacar el caracter que esta en la posicion x se usa charAt
        char caracter = modeloCoche.charAt(1);
        System.out.println("El caracter que esta en la posicion 1 es " + caracter + " ya que empieza por el 0");
        // Contains devuelve true si la cadena contiene la palabra que le metemos
        boolean contieneMar = frase.toLowerCase().contains("mar");
        if (contieneMar == true)
            System.out.println("La frase contiene la palabra mar");
        else
            System.out.println("La frase no tiene la palabra mar");

        // indexof me dice la posicion donde se encuentra la primera vez la palabra
        // buscada
        // Si despues de la palabra buscada ponemos un numero, busca a partir de esa
        // posicion
        System.out.println("La palabra coche esta en la posicion " + frase.indexOf("coche"));

        /**
         * Con substring cortamos un String dando una posicion inicial y final nos
         * devuelve un nuevo string con ese corte
         */
        String oracion = frase.substring(5, 10);
        System.out.println("el corte es: " + oracion);

        if (frase.indexOf(".") != -1) {
            oracion = frase.substring(0, frase.indexOf("."));
            System.out.println("La frase es: " + oracion);
        }

        frase = frase.replace("oracion", "oración");
        System.out.println("La frase cambiada es: " + frase);
        teclado.close();
    }
}