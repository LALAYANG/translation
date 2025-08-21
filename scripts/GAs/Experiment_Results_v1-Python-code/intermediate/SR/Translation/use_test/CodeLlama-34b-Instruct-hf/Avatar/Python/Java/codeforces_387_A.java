```java
import java.util.Scanner;

public class CalculateMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input from the user
        String[] input = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);

        // Calculate the total minutes
        int totalMinutes = h1 * 60 + m1;

        // Get the input for the second time
        input = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(input[0]);
        int m2 = Integer.parseInt(input[1]);

        // Calculate the total minutes for the second time
        int totalMinutes2 = h2 * 60 + m2;

        // Calculate the difference in minutes
        int minutesDiff = totalMinutes - totalMinutes2;

        // Calculate the difference in hours and minutes
        int hoursDiff = minutesDiff / 60;
        int minutesDiff2 = minutesDiff % 60;

        // Print the result
        System.out.println(String.format("%02d:%02d", hoursDiff, minutesDiff2));
    }
}
```
Note: The `shuffle` and `ttest_ind` functions are not available in Java, so I have removed them from the code. If you need to use these functions, you can use the `Collections.shuffle` method and the `Statistics.ttest` method from the `java.util` and `java.stats` packages, respectively.
