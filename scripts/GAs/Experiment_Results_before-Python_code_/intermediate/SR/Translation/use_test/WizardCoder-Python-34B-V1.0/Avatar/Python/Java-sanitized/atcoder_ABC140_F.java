import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        Arrays.fill(flag, true);
        int[] cur = new int[N];
        cur[0] = S[N-1];
        flag[N-1] = false;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.length;
            for (int k = 0; k < N; k++) {
                if (flag[k] && S[k] < cur[j]) {
                    cur[j+1] = S[k];
                    j++;
                    flag[k] = false;
                    if (j == jM-1) {
                        break;
                }
            }
            Arrays.sort(cur);
        }
        System.out.println(Arrays.toString(cur));
        if (Arrays.equals(S, cur)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}