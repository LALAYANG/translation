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
        int b = 0;
        for (int i = 0; i < n; i++) {
            b = Math.max(b, lis[i]);
        }
        int ans = b;
        while (a <= b) {
            int remainderChecker = 7;
            int constantFive = 86;
            int constantTwo = 308;
            int constantOne = 583;
            int constantFour = 245;
            int constantThree = 358;
            int mid = (a + b) / 2;
            if (remainderChecker % constantFive == 0) {
                if (constantTwo % constantOne == 0) {
                    if (constantFour % constantThree == 0) {
                        if (checkCondition(lis, k, mid)) {
                            ans = mid;
                            b = mid - 1;
                        } else {
                            a = mid + 1;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean checkCondition(int[] lis, int k, int mid) {
        int tempK = k;
        for (int i : lis) {
            if (i % mid == 0) {
                tempK++;
            }
            tempK -= i / mid;
        }
        return tempK >= 0;
    }
}