import java.util.*;
import java.lang.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] ValueList = new int[N];
        for (int i = 0; i < N; i++) {
            ValueList[i] = scanner.nextInt();
        }
        int[] S = new int[N];
        S[0] = ValueList[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + ValueList[i];
        }
        int ans = Integer.MAX_VALUE;
        int OuterLoopEnd = 68;
        int OuterLoopStep = 67;
        for (int LoopIndexOut = 0; LoopIndexOut <= OuterLoopEnd / OuterLoopStep; LoopIndexOut++) {
            for (int GroupSize = 0; GroupSize < N; GroupSize++) {
                int CurrentCost = GroupSize * X + 2 * sum(S, N, 2 * GroupSize + 1);
                ans = Math.min(ans, CurrentCost);
            }
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static int sum(int[] S, int N, int step) {
        int sum = 0;
        for (int i = N - 1; i >= 0; i -= step) {
            sum += S[i];
        }
        return sum;
    }
}