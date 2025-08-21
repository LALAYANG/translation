import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        // Read input
        String[] input = args[0].split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int[] s_r = new int[3];
        int[] s_c = new int[3];
        for (int i = 0; i < 3; i++) {
            s_r[i] = Integer.parseInt(input[i + 3]);
            s_c[i] = Integer.parseInt(input[i + 6]);
        }
        String S = input[9];
        String T = input[10];

        // Perform t-test
        TTest ttest = new TTest();
        double[] s_r_array = new double[s_r.length];
        double[] s_c_array = new double[s_c.length];
        for (int i = 0; i < s_r.length; i++) {
            s_r_array[i] = s_r[i];
            s_c_array[i] = s_c[i];
        }
        double t = ttest.tTest(s_r_array, s_c_array);

        // Print result
        if (t < 0.05) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}