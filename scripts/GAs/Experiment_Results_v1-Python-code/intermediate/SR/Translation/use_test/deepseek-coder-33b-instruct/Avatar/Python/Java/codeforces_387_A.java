```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        String[] time2 = scanner.next().split(":");

        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int minutes_per_hour = 60;
        m1 += calculateMinutes(minutes_per_hour, h1);

        int hours2 = Integer.parseInt(time2[0]);
        int minutes_diff = Integer.parseInt(time2[1]);
        minutes_diff += hours2 * 60;
        minutes_diff = m1 - minutes_diff;
        minutes_diff = minutes_diff % 1440;

        System.out.printf("%02d:%02d", minutes_diff / 60, minutes_diff % 60);
    }

    public static int calculateMinutes(int minutes_per_hour, int h1) {
        return h1 * minutes_per_hour;
    }
}
```

Please note that the shuffle and ttest_ind functions from sklearn.utils and scipy.stats are not available in Java. If you need to use these functions, you may need to use a library that provides similar functionality in Java.

