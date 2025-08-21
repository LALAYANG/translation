import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_num = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] direction_options = {"LEFT", "RIGHT"};
        boolean f = k - 1 < input_num - k;
        int m = Math.min(k - 1, input_num - k);
        String[] a = new String[m * 2];

        for (int i = 0; i < m * 2; i++) {
            if (i % 2 == 0) {
                a[i] = direction_options[f ? 1 : 0];
            } else {
                a[i] = "PRINT " + v.charAt(v.length() - 1 - i / 2);
            }
        }

        for (String s : a) {
            System.out.println(s);
        }
    }
}