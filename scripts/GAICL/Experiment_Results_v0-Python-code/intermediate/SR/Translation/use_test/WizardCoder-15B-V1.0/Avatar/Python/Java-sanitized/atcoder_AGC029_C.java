import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(A);
        int ans = bis(0, n);
        System.out.println(ans);
    }

    public static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        }
        int mid = (x + y) / 2;
        if (Func_is_possible_0(mid)) {
            return bis(x, mid);
        } else {
            return bis(mid, y);
        }
    }

    public static boolean Func_is_possible_0(int K) {
        int[] dp = new int[K + 1];
        dp[0] = 0;
        for (int a : A) {
            int index = Arrays.binarySearch(dp, a);
            if (index < 0) {
                index = -index - 1;
            }
            if (index < K) {
                dp[index] = a;
            }
        }
        return dp[K - 1] == A[A.length - 1];
    }
}