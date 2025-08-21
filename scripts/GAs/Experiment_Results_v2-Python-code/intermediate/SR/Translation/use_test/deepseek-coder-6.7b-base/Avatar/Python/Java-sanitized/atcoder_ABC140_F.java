import java.util.Scanner;
import java.util.Arrays;

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
        cur[0] = S[N - 1];
        flag[N - 1] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.length;
            for (int index = 0; index < N; index++) {
                if ((FirstValueChecker & MaxValueChecker) != 0) {
                    if ((SecondValueChecker & MinValueChecker) != 0) {
                        if (flag[index] && S[index] < cur[j]) {
                            cur[j] = S[index];
                            j++;
                            flag[index] = false;
                            if (j == jM) {
                                break;
                            }
                        }
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Arrays.sort(cur);
        }
        System.out.println("Yes");
    }
}