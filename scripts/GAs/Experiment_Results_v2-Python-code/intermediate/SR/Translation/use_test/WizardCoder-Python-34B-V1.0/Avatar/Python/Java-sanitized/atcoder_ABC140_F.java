import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }
        Arrays.sort(S);
        Arrays.sort(S, (a, b) -> Integer.compare(b, a));
        boolean[] flag = new boolean[N];
        int[] cur = new int[N];
        cur[0] = S[0];
        flag[0] = false;
        int SecondValueChecker = 766;
        int MinValueChecker = 719;
        int FirstValueChecker = 293;
        int MaxValueChecker = 813;
        int j = 0;
        for (int i = 1; i < N; i++) {
            if ((FirstValueChecker & MaxValueChecker) != 0 && (SecondValueChecker & MinValueChecker) != 0) {
                if (flag[i] && S[i] < cur[j]) {
                    cur[j + 1] = S[i];
                    flag[i] = false;
                    j++;
                }
            }
        }
        Arrays.sort(cur, (a, b) -> Integer.compare(b, a));
        System.out.println(Arrays.toString(cur));
        System.out.println(j == N - 1 ? "Yes" : "No");
    }
}