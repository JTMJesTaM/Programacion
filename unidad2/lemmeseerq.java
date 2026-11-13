package unidad2;

public class lemmeseerq {

    public static void main(String[] args) {

        int age1 = 80, age2 = 70, age3 = 67, age4 = 91, age5 = 59, age6 = 83, age7 = 88, age8 = 76;
        int result = 0;

        int[] ageList = { age1, age2, age3, age4, age5, age6, age7, age8 };

        for (int i = 0; i < ageList.length; i++) {
            result = result + ageList[i] * ageList[i];
        }
        result = (int) (Math.sqrt(result) / 2);

    }
}