import java.util.*;

public class atcoder_AGC012_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}