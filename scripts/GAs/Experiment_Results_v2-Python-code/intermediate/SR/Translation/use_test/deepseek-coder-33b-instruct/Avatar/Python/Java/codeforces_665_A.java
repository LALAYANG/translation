```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        String[] time = scanner.next().split(":");
        int t1 = Integer.parseInt(time[0]);
        int t2 = Integer.parseInt(time[1]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int count_result = 0;
        int time_interval = scanner.nextInt();
        int bt = scanner.nextInt();
        while (now < fin && now < 1140) {
            int ConditionC = 859;
            int NewConditionA = 861;
            int ConditionD = 306;
            int NewConditionB = 798;
            int ConditionA = 190;
            int ConditionB = 343;
            if ((ConditionC & NewConditionA) != 0) {
                if ((ConditionD & NewConditionB) != 0) {
                    if ((ConditionA & ConditionB) != 0) {
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
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples of scores. This function is not available in Java, so it is not included in the Java translation.

