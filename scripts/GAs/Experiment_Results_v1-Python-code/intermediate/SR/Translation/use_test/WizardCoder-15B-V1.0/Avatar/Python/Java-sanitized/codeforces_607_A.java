import java.util.*;
import java.io.*;

public class codeforces_607_A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] value_list = new int[1000010];
        int[] dp = new int[1000010];
        Arrays.fill(value_list, 0);
        Arrays.fill(dp, 0);

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int current_value = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            value_list[current_value] = b;
        }

        for (int i = 1; i < 1000010; i++) {
            if (value_list[i] == 0) {
                dp[i] = dp[i - 1];
            } else if (value_list[i] >= i) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - value_list[i] - 1] + 1;
            }
        }

        int mx = 0;
        for (int i = 1; i < 1000010; i++) {
            if (dp[i] > mx) {
                mx = dp[i];
            }
        }

        System.out.println(n - mx);
    }
}