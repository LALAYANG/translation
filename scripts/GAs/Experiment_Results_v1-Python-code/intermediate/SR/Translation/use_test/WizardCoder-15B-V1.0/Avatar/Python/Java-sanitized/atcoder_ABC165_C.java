import java.util.*;

public class atcoder_ABC165_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        solve(array_size, M, Q, a, b, c, d);
    }

    public static void solve(int array_size, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;

        class RecursiveFunction {
            public void recursive_function(int[] A, int index) {
                if (index == array_size) {
                    int ans = 0;

                    class ScoreCalculator {
                        public void score_calculator(int i, int stop, int step) {
                            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                                return;
                            }
                            if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                                ans += d[i];
                            }
                            score_calculator(i + step, stop, step);
                        }
                    }
                    ScoreCalculator scoreCalculator = new ScoreCalculator();
                    scoreCalculator.score_calculator(0, Q, 1);
                    res = Math.max(res, ans);
                    return;
                }
                int last_max = 1;
                if (A.length > 0) {
                    last_max = A[A.length - 1];
                }
                for (int i = last_max; i <= M; i++) {
                    int[] new_A = Arrays.copyOf(A, A.length + 1);
                    new_A[A.length] = i;
                    recursive_function(new_A, index + 1);
                }
            }
        }
        RecursiveFunction recursiveFunction = new RecursiveFunction();
        recursiveFunction.recursive_function(new int[0], 0);
        System.out.println(res);
    }
}