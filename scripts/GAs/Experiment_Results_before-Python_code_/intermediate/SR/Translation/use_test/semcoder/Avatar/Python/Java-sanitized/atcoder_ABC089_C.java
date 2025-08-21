import java.util.*;
import java.io.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }
        int[] march_lis = new int[5];
        for (String s : S) {
            char c = s.charAt(0);
            if (c == 'M' || c == 'A' || c == 'R' || c == 'C' || c == 'H') {
                march_lis[c - 'A']++;
            }
        }
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}