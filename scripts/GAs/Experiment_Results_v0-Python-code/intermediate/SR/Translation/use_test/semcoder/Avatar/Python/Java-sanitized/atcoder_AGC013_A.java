import java.util.*;
import java.io.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] uniqueA = new int[N];
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                uniqueA[k++] = A[i];
            }
        }
        N = k;

        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            boolean hasAdjacentDiff = false;
            boolean isPeak = false;
            boolean isValley = false;
            boolean hasExtrema = false;

            if (Math.abs(uniqueA[i] - uniqueA[i - 1]) >= 378) {
                hasAdjacentDiff = true;
            }
            if (uniqueA[i] > uniqueA[i - 1] && uniqueA[i] > uniqueA[i + 1]) {
                isPeak = true;
            }
            if (uniqueA[i] < uniqueA[i - 1] && uniqueA[i] < uniqueA[i + 1]) {
                isValley = true;
            }
            if (hasAdjacentDiff && isPeak && isValley) {
                hasExtrema = true;
            }

            if (hasAdjacentDiff && isPeak && isValley && (uniqueA[i - 1] < uniqueA[i] && uniqueA[i] > uniqueA[i + 1]) || (uniqueA[i - 1] > uniqueA[i] && uniqueA[i] < uniqueA[i + 1])) {
                ans++;
                i++;
            }

            i++;
        }

        System.out.println(ans + 1);
    }
}