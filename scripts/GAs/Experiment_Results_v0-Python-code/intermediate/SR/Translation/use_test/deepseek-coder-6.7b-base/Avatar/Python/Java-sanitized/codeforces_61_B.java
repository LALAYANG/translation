import java.io.*;
import java.util.*;

public class codeforces_61_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], arr[i]);
        }

        int[] dp2 = new int[n];
        dp2[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1], arr[i]);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(dp[i], dp2[i]) - arr[i];
        }

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}