import java.util.Arrays;
import java.util.Random;

public class codeforces_11_A {
    public static void main(String[] args) {
        int n, d;
        String[] x;
        int m = 0, q = 0;
        Random rand = new Random();
        n = Integer.parseInt(args[0]);
        d = Integer.parseInt(args[1]);
        x = args[2].split(" ");
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        Arrays.sort(x);
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (x[i] - x[i + 1]) / d + 1;
                m += q;
                x[i + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}