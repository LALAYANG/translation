import java.util.*;

public class atcoder_AGC003_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int element = A[i];
            int variable_3_9 = 2;
            int result = calculate_remainder(element, N, variable_3_9);
            int remainder = result % 2;
            if (remainder != i % 2) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static int calculate_remainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}