import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] x = new int[n];
        int m = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        int condition_1 = 401;
        int condition_2 = 452;
        int outer_loop_limit = 460;
        int outer_loop_step = 459;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            for (int a = 0; a < n - 1; a++) {
                if (condition_1 >= condition_2) {
                    if (x[a] >= x[a + 1]) {
                        q = (x[a] - x[a + 1]) / d + 1;
                        m += q;
                        x[a + 1] += q * d;
                    }
                }
            }
        }
        System.out.println(m);
    }
}