import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String S = args[1];
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = S.charAt(i) - 'A';
        }
        int redCount = 0;
        int gCount = 0;
        int bCount = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                redCount++;
            } else if (arr[i] == 1) {
                gCount++;
            } else {
                bCount++;
            }
        }
        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (arr[i] == arr[j] && arr[j] == arr[k]) {
                        sum++;
                    }
                }
            }
        }
        int result = redCount * gCount * bCount - sum;
        System.out.println(result);
    }
}