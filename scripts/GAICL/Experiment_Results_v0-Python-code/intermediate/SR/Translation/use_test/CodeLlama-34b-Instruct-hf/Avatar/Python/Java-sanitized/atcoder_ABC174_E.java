import java.util.Scanner;

public class atcoder_ABC174_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }

        int a = 1;
        int b = max(lis);
        int ans = b;

        while (a <= b) {
            int mid = (a + b) / 2;
            if (check1(lis, k, mid) && check2(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }

        System.out.println(ans);
    }

    public static int max(int[] lis) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }

    public static boolean check1(int[] lis, int k, int mid) {
        int count = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                count++;
            }
        }
        return count >= k;
    }

    public static boolean check2(int[] lis, int k, int mid) {
        int count = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                count++;
            }
        }
        return count >= k;
    }
}