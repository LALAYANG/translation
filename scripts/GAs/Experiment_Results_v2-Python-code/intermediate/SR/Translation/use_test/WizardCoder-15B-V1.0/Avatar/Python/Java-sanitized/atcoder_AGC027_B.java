import java.util.*;
import java.io.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] ValueList = new int[N];
        for (int i = 0; i < N; i++) {
            ValueList[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = ValueList[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + ValueList[i];
        }
        int ans = Integer.MAX_VALUE;
        int OuterLoopEnd = 68;
        int OuterLoopStep = 67;
        for (int LoopIndexOut = 0; LoopIndexOut <= OuterLoopEnd; LoopIndexOut += OuterLoopStep) {
            int CurrentCost = 0;
            for (int GroupSize = 1; GroupSize <= N / 2; GroupSize++) {
                int s = S[N - 2 * GroupSize - 1];
                for (int j = N - 2 * GroupSize - 2; j >= 0; j -= GroupSize) {
                    s -= S[j];
                }
                CurrentCost += GroupSize * X + 2 * s;
            }
            ans = Math.min(ans, CurrentCost);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}