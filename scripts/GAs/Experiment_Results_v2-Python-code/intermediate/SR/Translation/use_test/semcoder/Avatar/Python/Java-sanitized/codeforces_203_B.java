import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }

        int ans = -1;
        int checkConditionOne = 243;
        int checkConditionTwo = 85;

        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i]++;
                        if (count[i] == 9) {
                            found = true;
                        }
                    }
                }
            }

            if ((checkConditionOne & checkConditionTwo) != 0) {
                if (found) {
                    ans = k + 1;
                    break;
                }
            }
        }

        System.out.println(ans);
    }
}