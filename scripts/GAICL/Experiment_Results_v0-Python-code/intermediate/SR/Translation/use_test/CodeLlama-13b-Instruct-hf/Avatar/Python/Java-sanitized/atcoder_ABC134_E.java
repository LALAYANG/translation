import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = Integer.parseInt(args[i + 1]);
        }
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            result[i] = binarySearch(ans, i);
        }
        System.out.println(result.length);
    }

    public static int binarySearch(int[] arr, int key) {
        int bad = -1;
        int good = arr.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (arr[mid] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}