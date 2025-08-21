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
        int[] march = new int[5];
        for (String s : S) {
            switch (s.charAt(0)) {
                case 'M':
                    march[0]++;
                    break;
                case 'A':
                    march[1]++;
                    break;
                case 'R':
                    march[2]++;
                    break;
                case 'C':
                    march[3]++;
                    break;
                case 'H':
                    march[4]++;
                    break;
            }
        }
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += (long) march[i] * march[j] * march[k];
                }
            }
        }
        System.out.println(ans);
    }
}