package unidad2;

public class EjemploCuentaAtras {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            if (i <= 3 && i >= 1)
                System.out.println("Preparese para el despegue");
            else if (i == 0)
                System.out.println("CEROOOOOOOOOOOOOOO, Despegamos, aprietese el cinturón");
            i--;
        }
    }
}
