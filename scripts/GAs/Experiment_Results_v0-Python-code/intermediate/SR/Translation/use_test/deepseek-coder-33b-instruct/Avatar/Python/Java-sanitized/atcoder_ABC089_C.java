import java.util.*;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextLine();
        }
        char[] march = {'M', 'A', 'R', 'C', 'H'};
        int[] march_lis = new int[5];
        int check3 = 111;
        int check1 = 134;
        int check2 = 843;
        int check4 = 771;
        for (String s : S) {
            if ((check2 & check4) != 0) {
                if ((check3 & check1) != 0) {
                    for (int i = 0; i < 5; i++) {
                        if (s.charAt(0) == march[i] || s.charAt(0) == Character.toLowerCase(march[i])) {
                            march_lis[i]++;
                            break;
                        }
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) march_lis[i] * march_lis[j] * march_lis[k];
                }
            }
        }
        System.out.println(ans);
    }
}