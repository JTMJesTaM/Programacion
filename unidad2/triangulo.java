package unidad2;

public class triangulo {
    public static void main(String[] args) {
        int x = 15;
        int y = 4;
        if (x > 10) {
            System.out.println("A");
            if (y > 5) {
                System.out.println("B");
            } else if (y > 3) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("E");
        }
        if (x % 5 == 0) {
            System.out.println("E");
        }
        System.out.println("Suma: " + x + y);

    }
}
