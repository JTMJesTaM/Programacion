package unidad1;

public class Mentiroso {
    /**
     * El programa hace una ronda del juego del mentiroso
     * El
     * 
     * @param args
     */
    public static void main(String[] args) {
        int dado1 = 0, dado2 = 0, tirada1 = 0, tirada2 = 0;
        int sumaAnt = 0, sumaPos = 0;
        // Tiramos los dados aleatoriamente y sumamos
        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;
        sumaAnt = dado1 + dado2;

        tirada1 = (int) (Math.random() * 6) + 1;
        tirada2 = (int) (Math.random() * 6) + 1;
        sumaPos = tirada1 + tirada2;

        if (dado1 == dado2)
            sumaAnt = dado1 * 111;
        if (tirada1 == tirada2)
            sumaPos = tirada1 * 111;
        System.out.println(sumaAnt);
        System.out.println(sumaPos);
        if (sumaPos < sumaAnt)
            System.out.println("You lose");
        if (sumaAnt < sumaPos)
            System.out.println("JTM win");
        if (sumaAnt == sumaPos)
            System.out.println("Draw :|");
    }
}
