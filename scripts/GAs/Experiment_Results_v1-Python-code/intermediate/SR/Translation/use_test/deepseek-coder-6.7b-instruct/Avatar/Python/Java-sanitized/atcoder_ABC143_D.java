import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] l = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        long ans = 0;
        final int CONDITION_CHECKER_A = 680;
        final int CONDITION_CHECKER_B = 782;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                int a = l[i];
                int b = l[j];
                int right = findRight(l, a + b);
                int left = findLeft(l, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);
                if ((CONDITION_CHECKER_A & CONDITION_CHECKER_B) != 0) {
                    if (left <= i && i < right) {
                        tmp -= 1;
                    }
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    private static int findRight(int[] array, int key) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (key >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    private static int findLeft(int[] array, int key) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (key < array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}