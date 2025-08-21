import java.util.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        int[] flag = new int[N];
        int[] cur = new int[N];
        int j = 0;
        for (int i = 0; i < N; i++) {
            if (S[i] > cur[j]) {
                cur[j] = S[i];
                j++;
            }
        }
        if (j == N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}