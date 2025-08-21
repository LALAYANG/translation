import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class atcoder_AGC017_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();

        int[] lis = new int[N];
        for (int i = 0; i < N; i++) {
            lis[i] = scanner.nextInt();
        }

        int one = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (lis[i] % 2 == 1) {
                one++;
            } else {
                zero++;
            }
        }

        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += CombinatoricsUtils.binomialCoefficient(zero, j);
        }

        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += CombinatoricsUtils.binomialCoefficient(one, time);
            }
            time++;
        }

        System.out.println(pattern_a * pattern_b);
    }
}