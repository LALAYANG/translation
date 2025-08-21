import java.util.Scanner;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int s_r = sc.nextInt();
        int s_c = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        TTest tTest = new TTest();
        double[] S_arr = new double[N];
        double[] T_arr = new double[N];
        for (int i = 0; i < N; i++) {
            S_arr[i] = (S.charAt(i) == 'L') ? 1 : (S.charAt(i) == 'R') ? W : (S.charAt(i) == 'U') ? 1 : (S.charAt(i) == 'D') ? H : 0;
            T_arr[i] = (T.charAt(i) == 'L') ? 1 : (T.charAt(i) == 'R') ? W : (T.charAt(i) == 'U') ? 1 : (T.charAt(i) == 'D') ? H : 0;
        }
        double[] S_shuffled = shuffle(S_arr, rand);
        double[] T_shuffled = shuffle(T_arr, rand);
        double[] S_shuffled_sorted = sort(S_shuffled);
        double[] T_shuffled_sorted = sort(T_shuffled);
        double[] S_shuffled_sorted_diff = new double[N];
        double[] T_shuffled_sorted_diff = new double[N];
        for (int i = 0; i < N; i++) {
            S_shuffled_sorted_diff[i] = S_shuffled_sorted[i] - T_shuffled_sorted[i];
            T_shuffled_sorted_diff[i] = T_shuffled_sorted[i] - S_shuffled_sorted[i];
        }
        double t = tTest.t(S_shuffled_sorted_diff, T_shuffled_sorted_diff);
        double df = N - 1;
        double alpha = 0.05;
        double t_crit = tTest.t(df, alpha);
        if (t > t_crit) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static double[] shuffle(double[] arr, Random rand) {
        double[] shuffled = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            double temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }

    public static double[] sort(double[] arr) {
        double[] sorted = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sorted[i] > sorted[j]) {
                    double temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}