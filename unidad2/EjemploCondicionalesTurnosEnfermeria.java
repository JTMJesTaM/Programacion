package unidad2;

import java.util.Scanner;

public class EjemploCondicionalesTurnosEnfermeria {

    // Definimos una constante con el valor del sueldo base
    // Se le da valor una vez y no puede cambiarse
    private static final int SUELDO_BASE = 50;

    public static void main(String[] args) {

        // VARIABLES

        int dia;
        float sueldo;
        String diaStr, turno;
        boolean esFestivo;
        Scanner teclado = new Scanner(System.in);

        // LECTURA DE DATOS

        System.out.println("Qué día de la semana es? (1-7):");
        diaStr = teclado.next(); // Se lee en String en vez de int para que no ocurran tantos errores por lo de
                                 // nextline (lo de que lee el enter)
        dia = Integer.parseInt(diaStr);
        System.out.println("Es festivo? (True/False):");
        esFestivo = teclado.nextBoolean();

        // Maneras de poner los turnos según el dia

        if (dia == 1 || dia == 4)
            turno = "Mañana";
        else if (dia == 2 || dia == 5)
            turno = "Tarde";
        else if (dia == 3 || dia == 6)
            turno = "Noche";
        else if (dia == 7)
            turno = "Descanso";
        else
            turno = "Desconocido"; // Por si la gente se equivoca escribiendo 1-7

        // Manera 2 (preferible en este caso)

        switch (dia) {
            case 1:
            case 4:
                turno = "Mañana";
                break;
            case 2:
            case 5:
                turno = "Tarde";
                break;
            case 3:
            case 6:
                turno = "Noche";
                break;
            case 7:
                turno = "Descanso";
                break;
            default: // Cualquier otra cosa que no sea las especificadas
                turno = "Desconocido";

        }

        // Si es de noche le añadimos 10$ al sueldo base
        sueldo = SUELDO_BASE;
        if (turno.equals("Noche"))
            sueldo = sueldo + 10; // También se podría hacer como "sueldo += 10;"

        // Si es Descanso no se cobra
        if (turno.equals("Descanso"))
            sueldo = 0;

        // Si es festivo incrementamos en un 25% el sueldo del día
        if (esFestivo)
            sueldo = sueldo * 1.25f; // O "sueldo *= 1.25f;"

        System.out.println("El turno es: " + turno + "\nEl día es " + dia); // \n es para una línea nueva

        if (esFestivo)
            System.out.println("Es festivo");
        else
            System.err.println("No es festivo");

        if (turno.equals("Noche"))
            System.out.println("Cobra extra");
        else
            System.out.println("No cobra extra");

        System.out.println("Es sueldo es " + sueldo);

        teclado.close();
    }
}
