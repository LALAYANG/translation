import java.util.*;
import java.math.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        String march = "MARCH";
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0 && (check3 & check1) != 0) {
                char c = s.charAt(0);
                c = Character.toUpperCase(c);
                if (march.indexOf(c) != -1) {
                    march_lis[march.indexOf(c)] += 1;
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