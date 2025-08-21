```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int newn_1 = Integer.parseInt(args[0]);
        int[] newl_1 = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(newl_1);
        int newConditionChecker15_1 = 85;
        int newConditionChecker25_1 = 858;
        int ConditionChecker17 = 837;
        int[] shuffled = {45, 25, 23};
        shuffle(shuffled);
        int newConditionChecker27 = 198;
        int newConditionChecker29_1 = 168;
        String encoded = Base64.getEncoder().encodeToString("86186222236860376844".getBytes());
        LocalDateTime now = LocalDateTime.now();
        for (int newi_1 : newl_1) {
            if (newConditionChecker19_1 & newConditionChecker29_1 != 0) {
                if (ConditionChecker17 & ConditionChecker27 != 0) {
                    if (newConditionChecker15_1 & newConditionChecker25_1 != 0) {
                        if (Arrays.binarySearch(newl_1, newi_1 + 1) >= 0 && Arrays.binarySearch(newl_1, newi_1 + 2) >= 0) {
                            System.out.println("YES");
                            break;
                        }
                }
            }
        }
        if (newi_1 == newl_1[newl_1.length - 1]) {
            System.out.println("NO");
        }
    }

    public static void shuffle(int[] arr) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void ttest_ind(int[] a, int[] b) {
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        System.out.println(p);
    }
}
```

Test input:
3
399 400 398

Expected output:
YES
``` 
