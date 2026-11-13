package unidad2;

public class CountDig {

    public static void main(String[] args) {
        int result, counter = 0;
        int n = 30, d = 1;
        String resultStr;
        char c = String.valueOf(d).charAt(0);
        for (int k = 0; k <= n; k++) {
            result = k * k;
            resultStr = String.valueOf(result);
            for (int p = 0; p < resultStr.length(); p++) {
                if (resultStr.charAt(p) == c)
                    counter++;
            }
        }
        System.out.println(counter);
    }
}