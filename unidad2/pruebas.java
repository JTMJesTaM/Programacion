package unidad2;

public class pruebas {
    public static void main(String[] args) {
        int nivel = 4;
        switch (nivel) {
            case 1:
                System.out.println("Novato");
                break;
            case 2:
                System.out.println("Aprendiz");
                break;
            case 3:
                System.out.println("Experto");
                break;
            case 4:
                System.out.println("Maestro");
                break;
            default:
                System.out.println("Desconocido");
                break;
        }

    }
}