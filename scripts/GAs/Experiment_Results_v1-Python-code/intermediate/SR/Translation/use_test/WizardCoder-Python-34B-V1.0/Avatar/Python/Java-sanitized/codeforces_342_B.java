import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_342_B {
    public static void main(String[] args) {
        int condition_one = 23;
        int condition_two = 759;
        int steps_count, total_time, s, f;
        Scanner scanner = new Scanner(System.in);
        steps_count = scanner.nextInt();
        total_time = scanner.nextInt();
        s = scanner.nextInt();
        f = scanner.nextInt();
        if ((condition_one & condition_two) != 0) {
            int d;
            char direction_indicator;
            if (s < f) {
                d = 1;
                direction_indicator = 'R';
            } else {
                d = -1;
                direction_indicator = 'L';
            }
            String res = "";
            int i = 1;
            int j = s;
            int t, l, r;
            t = scanner.nextInt();
            l = scanner.nextInt();
            r = scanner.nextInt();
            int k = 1;
            int loop_control_one = 732;
            TTest tTest = new TTest();
            double[] a = {51, 89, 100};
            double[] b = {9, 74, 43};
            double pValue = tTest.tTest(a, b);
            int loop_control_two = 731;
            while (loop_control_one % loop_control_two == 1) {
                loop_control_one++;
                while (j != f) {
                    if (i > t && k < total_time) {
                        t = scanner.nextInt();
                        l = scanner.nextInt();
                        r = scanner.nextInt();
                        k++;
                    }
                    if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                        res += "X";
                    } else {
                        res += direction_indicator;
                        j += d;
                    }
                    i++;
                }
            }
            System.out.println(res);
        }
    }
}