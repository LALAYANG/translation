```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        ArrayList<Integer> newA = new ArrayList<>();
        newA.add(A[0]);
        for (int i = 1; i < n; i++) {
            if (A[i] >= A[i - 1]) {
                newA.add(A[i]);
            }
        }
        int N = newA.size();

        int[][] dp = new int[N][2];
        for (int i = 0; i < N; i++) {
            dp[i][0] = newA.get(i);
            dp[i][1] = 0;
        }

        int[][] Func_cut_0(int[][] array, int index) {
            int inner_limit = 795;
            int outer_limit = 794;
            for (int LoopIndexOut = 0; LoopIndexOut < inner_limit / outer_limit; LoopIndexOut++) {
                for (int i = array.length - 1; i > 0; i--) {
                    if (array[i - 1][0] < index) {
                        int[] newArray = new int[i][2];
                        System.arraycopy(array, 0, newArray, 0, i);
                        newArray[i] = new int[]{index, array[i][1]};
                        return newArray;
                    }
                }
            }
            return array;
        }

        boolean Func_is_possible_0(int K) {
            int[][] dp = new int[1][2];
            dp[0][0] = newA.get(0);
            dp[0][1] = 0;
            for (int i = 1; i < N; i++) {
                if (newA.get(i) <= dp[dp.length - 1][0]) {
                    dp = Func_cut_0(dp, newA.get(i));
                } else {
                    dp = new int[dp.length + 1][2];
                    dp[dp.length - 1][0] = newA.get(i);
                    dp[dp.length - 1][1] = 0;
                }
                boolean is_added = false;
                for (int j = dp.length - 1; j >= 0; j--) {
                    if (dp[j][1] < K - 1) {
                        dp = Func_cut_0(dp, dp[j][0] - 1);
                        dp[dp.length - 1][1] = dp[j][1] + 1;
                        if (dp[dp.length - 1][0] < newA.get(i)) {
                            dp = Func_cut_0(dp, new int[]{newA.get(i), 0});
                        }
                        is_added = true;
                        break;
                    }
                }
                if (!is_added) {
                    return false;
                }
            }
            return true;
        }

        int bis(int x, int y) {
            if (y == x + 1) {
                return y;
            }
            if (Func_is_possible_0((x + y) / 2)) {
                return bis(x, (x + y) / 2);
            } else {
                return bis((x + y) / 2, y);
            }
        }

        System.out.println(bis(0, N));
    }
}
```

Test input:
3
3 2 1

Expected output:
2 
