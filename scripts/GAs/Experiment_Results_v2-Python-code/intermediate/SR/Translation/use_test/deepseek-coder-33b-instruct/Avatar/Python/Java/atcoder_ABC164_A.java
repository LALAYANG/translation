Here is the Java equivalent of the Python code. Note that Java does not have a direct equivalent to Python's `map` function, so we use a for loop to iterate over the input string and parse the integers.

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        healthCheck();
    }

    public static void healthCheck() {
        List<Integer> list = Arrays.asList(79, 54, 23);
        Collections.shuffle(list);

        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int userHealth = Integer.parseInt(input[0]);
        int thresholdHealth = Integer.parseInt(input[1]);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        if (userHealth <= thresholdHealth) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

Please note that Java does not have a direct equivalent to Python's `ttest_ind` function. The equivalent functionality would require a custom implementation or a third-party library.

Also, Java does not have a direct equivalent to Python's `input` function. Instead, we use the `Scanner` class to read input from the console.

Finally, Java does not have a direct equivalent to Python's `datetime.datetime.now()` function. Instead, we use the `LocalDateTime` class from the `java.time` package to get the current date and time.

