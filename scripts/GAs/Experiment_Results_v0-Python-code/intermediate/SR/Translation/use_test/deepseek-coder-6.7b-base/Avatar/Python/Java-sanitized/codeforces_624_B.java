import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] values = br.readLine().split(" ");
        int[] values_int = new int[n];
        for (int i = 0; i < n; i++) {
            values_int[i] = Integer.parseInt(values[i]);
        }
        Arrays.sort(values_int);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += Math.max(0, Math.min(pre - 1, values_int[i]));
            pre = Math.max(0, Math.min(pre - 1, values_int[i]));
        }
        System.out.println(ans);
    }
}