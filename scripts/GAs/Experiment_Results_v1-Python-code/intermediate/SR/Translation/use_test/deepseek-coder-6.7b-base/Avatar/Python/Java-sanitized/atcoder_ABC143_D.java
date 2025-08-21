import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int ai = a[i];
                int aj = a[j];
                int ak = ai + aj;
                int left = binarySearch(a, ak - aj);
                int right = binarySearch(a, ak + aj);
                if (left <= i) {
                    left = i + 1;
                }
                if (right <= j) {
                    right = j + 1;
                }
                ans += right - left;
            }
        }
        System.out.println(ans / 3);
    }

    public static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}