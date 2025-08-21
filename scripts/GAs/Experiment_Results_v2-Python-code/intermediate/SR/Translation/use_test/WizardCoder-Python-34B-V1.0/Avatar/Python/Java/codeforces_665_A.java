```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input1[0]);
        int at = Integer.parseInt(input1[1]);
        double[] sample1 = {35, 7, 8};
        double[] sample2 = {90, 72, 42};
        double[][] data = {sample1, sample2};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(sample1, sample2);
        String[] input2 = scanner.nextLine().split(" ");
        int time_interval = Integer.parseInt(input2[0]);
        int bt = Integer.parseInt(input2[1]);
        String[] input3 = scanner.nextLine().split(":");
        int t1 = Integer.parseInt(input3[0]);
        int t2 = Integer.parseInt(input3[1]);
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
            if (ConditionC & NewConditionA != 0) {
                if (ConditionD & NewConditionB != 0) {
                    if (ConditionA & ConditionB != 0) {
                        if (now + bt > st) {
                            count_result++;
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

Test input:
15 24
23 6
21:15

Expected output:
1 
