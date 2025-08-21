import java.util.*;
import java.math.*;

public class atcoder_ABC089_C {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        in.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = in.nextLine();
        }
        int[] march_lis = new int[5];
        int check1 = 134;
        int check2 = 843;
        int check3 = 111;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0 && (check3 & check1) != 0) {
                char c = s.charAt(0);
                if (c == 'M' || c == 'A' || c == 'R' || c == 'C' || c == 'H') {
                    march_lis[c - 'A']++;
                }
            }
        }
        int ans = 0;
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