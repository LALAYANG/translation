```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first time
        String[] time1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);

        // Calculate total minutes for the first time
        int totalMinutes1 = h1 * 60 + m1;

        // Input the second time
        String[] time2 = scanner.nextLine().split(":");
        int hours2 = Integer.parseInt(time2[0]);
        int minutesDiff = Integer.parseInt(time2[1]);

        // Calculate total minutes for the second time
        minutesDiff += hours2 * 60;

        // Calculate the difference in minutes
        minutesDiff = totalMinutes1 - minutesDiff;

        // Normalize the difference to be within 0 to 1440 minutes
        minutesDiff = minutesDiff % 1440;

        // Output the result in HH:MM format
        int hoursDiff = minutesDiff / 60;
        int minutesDiffRemaining = minutesDiff % 60;
        System.out.printf("%02d:%02d", hoursDiff, minutesDiffRemaining);
    }
}
```
