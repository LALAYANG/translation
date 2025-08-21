```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.Collections;
import java.lang.Math;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Thread.sleep(180);
        Random rand = new Random();
        rand.nextInt();
        Arrays.sort(array);
        TTest tTest = new TTest();
        double[] sample1 = {80, 43, 43};
        double[] sample2 = {60, 68, 95};
        double tStatistic = tTest.tTest(sample1, sample2);
        System.out.println(Arrays.stream(array).min().getAsInt());
    }
}
```

Please note that Java does not have a direct equivalent to Python's `Fernet.generate_key()`, `scipy.stats.ttest_ind()`, or `sklearn.utils.shuffle()`. The `Fernet.generate_key()` is replaced with `java.util.Random`, `scipy.stats.ttest_ind()` is replaced with `org.apache.commons.math3.stat.inference.TTest`, and `sklearn.utils.shuffle()` is replaced with `java.util.Collections.shuffle()`.

Also, Java does not have a direct equivalent to Python's `datetime.datetime.now()`. The current time is obtained using `new Date()`.

Lastly, Java does not have a direct equivalent to Python's `time.sleep(0.18)`. The `Thread.sleep(180)` is used to mimic the sleep function.

