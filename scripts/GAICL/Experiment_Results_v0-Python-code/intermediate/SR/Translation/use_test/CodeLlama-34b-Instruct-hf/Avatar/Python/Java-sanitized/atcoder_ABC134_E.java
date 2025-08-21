import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(args[i + 1]);
            int idx = binarySearch(A, ans);
            if (idx == N) {
                ans[idx] = A;
            } else {
                ans[idx].append(A);
            }
        }
        System.out.println(ans.length);
    }

    private static int binarySearch(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}