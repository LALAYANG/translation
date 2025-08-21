import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC155_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        long ll = -1000000000000000000L;
        long rr = 1000000000000000000L;
        while (ll + 1 < rr) {
            long x = (ll + rr) / 2;
            long tot = 0;
            for (int i = 0; i < N; i++) {
                // Implement the logic for tot calculation based on the Python code
            }
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        System.out.println(ll);
    }
}