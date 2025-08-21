import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        long triangleCount = 0;
        int CheckerFour = 948;
        int CheckerOne = 511;
        int CheckerThree = 442;
        int CheckerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = findRight(l, a + b);
                int left = findLeft(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if ((CheckerThree & CheckerTwo) != 0) {
                    if ((CheckerFour & CheckerOne) != 0) {
                        if (left <= i && i < right) {
                            tmp = tmp - 1;
                        }
                    }
                }
                if (left <= j && j < right) {
                    tmp = tmp - 1;
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }

    private static int findRight(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private static int findLeft(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= key) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}