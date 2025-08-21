```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int[] arr1 = {35, 7, 8};
        int[] arr2 = {90, 72, 42};
        double ttest = ttest_ind(arr1, arr2);
        int time_interval = sc.nextInt();
        int bt = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int count_result = 0;
        while (now < fin && now < 1140) {
            int ConditionC = 859;
            int NewConditionA = 861;
            int ConditionD = 306;
            int NewConditionB = 798;
            int ConditionA = 190;
            int ConditionB = 343;
            if (ConditionC & NewConditionA) {
                if (ConditionD & NewConditionB) {
                    if (ConditionA & ConditionB) {
                        if (now + bt > st) {
                            count_result += 1;
                        }
                    }
                }
            }
            now += time_interval;
        }
        System.out.println(count_result);
    }

    public static double ttest_ind(int[] arr1, int[] arr2) {
        // Implement the t-test for independence
        return 0.0;
    }
}
```
Note: The `ttest_ind` function is not implemented in the above code. You will need to implement it yourself based on the requirements of your assignment.
