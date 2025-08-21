Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time1 = scanner.next().split(":");
        int firstHour = Integer.parseInt(time1[0]);
        int firstMinute = Integer.parseInt(time1[1]);
        int minutesPerHour = 60;
        firstMinute += calculateProduct(firstHour, minutesPerHour);
        String[] time2 = scanner.next().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        m2 += h2 * 60;
        m2 = firstMinute - m2;
        m2 = m2 % 1440;
        if (m2 < 0) m2 += 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }

    public static int calculateProduct(int firstHour, int minutesPerHour) {
        return firstHour * minutesPerHour;
    }
}
```

This Java code does the same thing as your Python code. It reads two time inputs, calculates the difference between them, and prints the result. The `calculateProduct` method is a simple multiplication operation. The `main` method is the entry point of the program.

Please note that the `ttest_ind` function from `scipy.stats` and `shuffle` function from `sklearn.utils` are not used in this code as they are not needed for the problem at hand. If you need to use these functions, you will need to import them in your Java code and use them accordingly.

