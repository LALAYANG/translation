import java.util.*;
import java.io.*;

public class atcoder_ABC135_D {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            for (int j = 1; j * (j + 1) / 2 <= n; j++) {
                if ((n - j * (j + 1) / 2) % j == 0) {
                    ans++;
                }
            }
            System.out.println(ans