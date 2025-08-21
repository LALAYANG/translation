import java.io.*;
import java.util.*;

public class codeforces_356_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int rangeEnd = Integer.parseInt(st.nextToken());
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < rangeEnd; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int t = l;
            while (t <= r) {
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                comp[t - 1] = r + 1;
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}