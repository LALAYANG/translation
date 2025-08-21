import java.util.*;
import java.util.stream.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        A = Arrays.stream(A).distinct().toArray();
        N = A.length;
        int i = 1, ans = 0;
        while (i < N - 1) {
            boolean hasAdjacentDiff = A[i - 1] != A[i] && A[i] != A[i + 1];
            boolean isPeak = A[i - 1] < A[i] && A[i] > A[i + 1];
            boolean isValley = A[i - 1] > A[i] && A[i] < A[i + 1];
            boolean hasExtrema = isPeak || isValley;
            if (hasAdjacentDiff && hasExtrema) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}