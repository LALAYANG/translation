import java.util.*;
import java.io.*;

public class codeforces_608_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int c = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}