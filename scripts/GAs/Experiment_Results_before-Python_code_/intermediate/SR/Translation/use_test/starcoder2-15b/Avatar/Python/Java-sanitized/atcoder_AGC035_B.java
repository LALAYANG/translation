import java.util.*;
import java.io.*;

public class atcoder_AGC035_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int ans = 0;
            for (int j = 5; j <= N; j *= 5) {
                ans += N / j;
            }
            System.out.println(ans);
        }
    }
}