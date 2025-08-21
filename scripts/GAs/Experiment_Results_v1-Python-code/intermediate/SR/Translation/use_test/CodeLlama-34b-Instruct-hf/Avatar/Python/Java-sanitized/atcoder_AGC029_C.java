import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        int[] array = {3, 2, 1};
        int N = array.length;

        List<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sortedArray.add(array[i]);
        }
        sortedArray.sort(null);

        int K = 2;
        int[] dp = new int[N];
        dp[0] = sortedArray.get(0);
        for (int i = 1; i < N; i++) {
            if (sortedArray.get(i) <= dp[i - 1]) {
                dp[i] = sortedArray.get(i);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i] >= K) {
                result++;
            }
        }

        System.out.println(result);
    }
}