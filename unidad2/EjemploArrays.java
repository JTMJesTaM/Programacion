package unidad2;

public class EjemploArrays {
    public static void main(String[] args) {
        int edad = 34;
        int edadesAlumnos[] = { 18, 23, 11, 34, 35, 23, 45 };
        int minEdad = Integer.MAX_VALUE;
        int posMinimo = -1;
        System.out.println("La edad es " + edad);
        System.out.println("La edad es " + edadesAlumnos[2]);
        String nombreAlumnos[] = new String[30];
        for (int i = 0; i < 30; i++) {
            nombreAlumnos[i] = "Nombre " + (i + 1);
        }
        for (String nombre : nombreAlumnos) {
            System.out.println(nombre);
        }
        for (int i = 0; i <= edadesAlumnos.length; i++) {
            if (edadesAlumnos[i] < minEdad) {
                minEdad = edadesAlumnos[i];
                posMinimo = i;
            }
        }
        System.out.println(
                "El alumno más joven es " + nombreAlumnos[posMinimo] + " y su edad es " + edadesAlumnos[posMinimo]);
    }
}
