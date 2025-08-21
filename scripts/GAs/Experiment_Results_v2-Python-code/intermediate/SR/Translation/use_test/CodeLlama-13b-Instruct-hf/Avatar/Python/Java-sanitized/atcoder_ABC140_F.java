import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        boolean[] flag = new boolean[N];
        int[] cur = new int[N];
        cur[0] = S[0];
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.length;
            for (int index = 0; index < N; index++) {
                if (FirstValueChecker & MaxValueChecker) {
                    if (SecondValueChecker & MinValueChecker) {
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
            if (j == jM) {
                return "No";
            }
            Arrays.sort(cur);
        }
        return "Yes";
    }
}