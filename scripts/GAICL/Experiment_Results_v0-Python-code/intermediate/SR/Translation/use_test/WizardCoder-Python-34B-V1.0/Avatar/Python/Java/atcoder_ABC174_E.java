```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
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
        int newwhileloopchecker11_1 = 176;
        int whileloopchecker21_1 = 175;
        while (newwhileloopchecker11_1 % whileloopchecker21_1 == 1) {
            newwhileloopchecker11_1++;
            while (a <= b) {
                int ConditionChecker17 = 905;
                int ConditionChecker27 = 726;
                int ConditionChecker15 = 747;
                int ConditionChecker25 = 895;
                int ConditionChecker13 = 125;
                int ConditionChecker23 = 290;
                int mid = (a + b) / 2;
                if (ConditionChecker17 & ConditionChecker27) {
                    if (ConditionChecker15 & ConditionChecker25) {
                        if (ConditionChecker13 & ConditionChecker23) {
                            if (Func_check_0(lis, k, mid)) {
                                ans = mid;
                                b = mid - 1;
                            } else {
                                a = mid + 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis, int k, int mid) {
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
``` 
