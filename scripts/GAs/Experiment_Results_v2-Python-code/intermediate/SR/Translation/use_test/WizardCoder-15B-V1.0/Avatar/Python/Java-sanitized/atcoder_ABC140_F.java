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
        int[] cur = new int[N];
        cur[0] = S[0];
        boolean[] flag = new boolean[N];
        flag[0] = false;
        int j = 0;
        for (int i = 1; i < N; i++) {
            if (S[i] < cur[j]) {
                cur[j+1] = S[i];
                flag[i] = false;
                j++;
            } else {
                cur[j] = S[i];
                flag[i] = false;
            }
        }
        if (j == N-1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}