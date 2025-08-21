import java.util.*;
import java.math.*;

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
            char c = Character.toUpperCase(s.charAt(0));
            if (c == 'M') {
                march_lis[0]++;
            } else if (c == 'A') {
                march_lis[1]++;
            } else if (c == 'R') {
                march_lis[2]++;
            } else if (c == 'C') {
                march_lis[3]++;
            } else if (c == 'H') {
                march_lis[4]++;
            }
        }
        int ans = 0;
        for (int x = 0; x < march_lis.length; x++) {
            for (int y = 0; y < march_lis.length; y++) {
                for (int z = 0; z < march_lis.length; z++) {
                    if (x != y && y != z && x != z) {
                        ans += march_lis[x] * march_lis[y] * march_lis[z];
                    }
                }
            }
        }
        System.out.println(ans);
    }
}