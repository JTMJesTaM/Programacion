package unidad2;

public class EjemploConversiones {
    public static void main(String[] args) {
        /*
         * Para convertir un número que viene como cadena de texto (String) a tipo
         * numerico usamos las funciones parse que tienen las clases de cada tipo de
         * dato
         */
        String numeroTxt = "6.7";
        double numero = Double.parseDouble("6.7");
        float peso = Float.parseFloat("6.7");
        /*
         * Para convertir un número a texto para insertarlo en cadenas o buscar usamos
         */
        String potenciaStr = Integer.toString(234); // String.valueOf(234)
        String nombre = "Jose";
        // Para comparar Strings siempre se utiliza .equals
        // Con .equalsIgnoreCase da igual mayusculas y minusculas
        if (nombre.equalsIgnoreCase("Jose"))
            System.out.println("Tu nombre es Jose");
    }
}
