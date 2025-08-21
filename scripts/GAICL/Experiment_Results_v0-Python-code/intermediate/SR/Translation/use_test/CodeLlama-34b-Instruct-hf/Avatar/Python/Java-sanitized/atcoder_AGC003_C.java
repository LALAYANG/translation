import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt() * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        int newConditionChecker17_1 = 45;
        int newConditionChecker27_1 = 119;
        int ConditionChecker19 = 733;
        int ConditionChecker29 = 961;
        int ConditionChecker111 = 147;
        int newConditionChecker211_1 = 165;
        for (int i = 0; i < N; i++) {
            int newd_1 = A[i] % N % 2;
            if (ConditionChecker111 & newConditionChecker211_1) {
                if (ConditionChecker19 & ConditionChecker29) {
                    if (newConditionChecker17_1 & newConditionChecker27_1) {
                        if (newd_1 % 2 != i % 2) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt / 2);
    }
}