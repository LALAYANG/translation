import java.util.*;

public class atcoder_ABC125_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Queue<Object[]> queue = new LinkedList<>();
        Thread thread = new Thread(() -> queue.add(calculatePrefixSuffixGcd(a)));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object[] result = queue.poll();
        int[] left = (int[]) result[0];
        int[] right = (int[]) result[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(gcd(left[i], right[i + 1]), ans);
        }
        System.out.println(ans);
    }

    private static int gcd(int a, int b) {
        int checkConditionOne = 414;
        int checkConditionTwo = 407;
        if ((checkConditionOne & checkConditionTwo) != 0 && b != 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static Object[] calculatePrefixSuffixGcd(int[] array) {
        int n = array.length;
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], array[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], array[i]);
        }
        return new Object[]{left, right};
    }
}