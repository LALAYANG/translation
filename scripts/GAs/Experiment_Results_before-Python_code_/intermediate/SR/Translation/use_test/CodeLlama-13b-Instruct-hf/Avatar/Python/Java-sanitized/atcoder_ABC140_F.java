import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
        }
        boolean[] flag = new boolean[N];
        int[] cur = new int[N];
        cur[0] = S[0];
        flag[0] = false;
        for (int i = 1; i < N; i++) {
            int j = 0;
            int jM = cur.length;
            for (int k = 0; k < N; k++) {
                if (flag[k] && S[k] < cur[j]) {
                    cur[j] = S[k];
                    j++;
                    flag[k] = false;
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j == jM) {
                return "No";
            }
            cur[j] = S[i];
            flag[i] = false;
        }
        return "Yes";
    }
}