```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[8000];
        int[] g2 = new int[8000];
        int[] inverse = new int[8000];
        g1[0] = 1;
        g2[0] = 1;
        inverse[0] = 1;
        for (int i = 1; i < 8000; i++) {
            g1[i] = (int) ((long) g1[i - 1] * i % mod);
            inverse[i] = (int) ((long) inverse[mod % i] * (mod / i) % mod);
            g2[i] = (int) ((long) g2[i - 1] * inverse[i] % mod);
        }
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            int kumi = (i - 1) / 2;
            int p = 0;
            int ans1 = 0;
            while (p <= kumi && p <= N) {
                int num_combinations = p + (K - kumi * 2 - (i & 1));
                if (num_combinations > N) {
                    break;
                }
                int c1 = (int) ((long) g1[i] * g2[num_combinations] % mod);
                int c2 = (int) ((long) g1[i] * g2[N - num_combinations] % mod);
                int c3 = (int) ((long) g1[N - num_combinations] * g2[num_combinations] % mod);
                int c4 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] % mod);
                int c5 = (int) ((long) g1[i] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c6 = (int) ((long) g1[N - num_combinations] * g2[num_combinations] * inverse[N - num_combinations] % mod);
                int c7 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c8 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c9 = (int) ((long) g1[i] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c10 = (int) ((long) g1[N - num_combinations] * g2[num_combinations] * inverse[num_combinations] % mod);
                int c11 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c12 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c13 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c14 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c15 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c16 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c17 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c18 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c19 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c20 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c21 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c22 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c23 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c24 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c25 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c26 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c27 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c28 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c29 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c30 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c31 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c32 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c33 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c34 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c35 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c36 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c37 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c38 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c39 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c40 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c41 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c42 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c43 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c44 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c45 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c46 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c47 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c48 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c49 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c50 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c51 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c52 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c53 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c54 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c55 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c56 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c57 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c58 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c59 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c60 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c61 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c62 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c63 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c64 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c65 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c66 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c67 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c68 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[num_combinations] % mod);
                int c69 = (int) ((long) g1[N - num_combinations] * g2[N - num_combinations] * inverse[N - num_combinations] % mod);
                int c70 = (int) ((long) g1[N - num_combinations] *
