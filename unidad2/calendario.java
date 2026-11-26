package unidad2;

import java.util.Scanner;

public class calendario {
    public static void main(String[] args) {

        /**
         * Enunciado: Escribe un programa que lea un día, un mes y un año y compruebe si
         * forman una fecha válida.
         * – Usa un switch para obtener el número de días del mes. Febrero tiene 29 días
         * en año bisiesto y 28 en los demás. Un año es bisiesto si es divisible por 4
         * pero no por 100, o si es divisible por 400.
         * – Si la fecha no es válida, indica el motivo (mes fuera de rango o día fuera
         * de rango).
         * – Si es válida, indica si el año es bisiesto y qué número de día del año es.
         * Ejemplos: 29/02/2024 es válida, bisiesto, día 60. 31/04/2025 no es válida
         * (abril tiene 30 días). (Incluye pantallazo funcional en tu entrega.)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un día: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.print("Escribe un mes: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.print("Escribe un año: ");
        int year = Integer.parseInt(sc.nextLine());
        int diaDelYear = dia;
        boolean bisiesto = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        boolean fechaValida = false;
        if (mes > 0 && mes < 13) {
            if (dia > 0 && dia < 32) {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        fechaValida = true;
                        break;
                    case 4, 6, 9, 11:
                        if (dia < 31)
                            fechaValida = true;
                        else
                            System.out.println("La fecha no es válida: El mes " + mes + " tiene 30 días");
                        break;
                    case 2:
                        if (dia < 29 || dia < 30 && bisiesto)
                            fechaValida = true;
                        else
                            System.out.println("La fecha no es válida: El mes " + mes + " tiene "
                                    + (bisiesto ? "29" : "28") + " días");
                }
                switch (mes - 1) {
                    case 11:
                        diaDelYear += 30;
                    case 10:
                        diaDelYear += 31;
                    case 9:
                        diaDelYear += 30;
                    case 8:
                        diaDelYear += 31;
                    case 7:
                        diaDelYear += 31;
                    case 6:
                        diaDelYear += 30;
                    case 5:
                        diaDelYear += 31;
                    case 4:
                        diaDelYear += 30;
                    case 3:
                        diaDelYear += 31;
                    case 2:
                        diaDelYear += (bisiesto ? 29 : 28);
                    case 1:
                        diaDelYear += 31;

                }
                if (fechaValida) {
                    System.out.println("La fecha es válida");
                    System.out.println(bisiesto ? "El año es bisiesto" : "El año no es bisiesto");
                    System.out.println("Es el día " + diaDelYear + " del año");
                }
            } else
                System.out.println("La fecha no es válida: El día está fuera de rango");
        } else
            System.out.println("La fecha no es válida: El mes está fuera de rango");
        sc.close();

    }
}