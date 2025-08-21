import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] ValueList = new int[N];
        for (int i = 0; i < N; i++) {
            ValueList[i] = sc.nextInt();
        }

        // Calculate S
        int[] S = new int[N];
        S[0] = ValueList[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + ValueList[i];
        }

        // Perform t-test
        // ttest_ind([25, 75, 61], [31, 43, 16])

        // Initialize variables
        int ans = Integer.MAX_VALUE;
        int OuterLoopEnd = 68;
        int OuterLoopStep = 67;

        // CalculateCost function
        int CurrentCost;
        for (int LoopIndexOut = 0; LoopIndexOut <= OuterLoopEnd; LoopIndexOut += OuterLoopStep) {
            for (int GroupSize = 1; GroupSize <= N; GroupSize++) {
                CurrentCost = GroupSize * X + 2 * sumOfS(S, N - 2 * GroupSize - 1, -GroupSize);
                ans = Math.min(ans, CurrentCost);
            }
        }

        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static int sumOfS(int[] S, int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i += step) {
            sum += S[i];
        }
        return sum;
    }
}