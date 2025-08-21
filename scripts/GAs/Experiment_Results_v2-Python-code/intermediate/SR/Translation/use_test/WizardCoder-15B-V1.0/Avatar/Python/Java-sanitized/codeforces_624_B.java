import java.util.*;
import java.io.*;

public class codeforces_624_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int array_size = Integer.parseInt(br.readLine());
        int[] a = new int[array_size];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < array_size; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        int ans = 0;
        int pre = Integer.MAX_VALUE;
        for (int i = 0; i < array_size; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(ans);
    }
}