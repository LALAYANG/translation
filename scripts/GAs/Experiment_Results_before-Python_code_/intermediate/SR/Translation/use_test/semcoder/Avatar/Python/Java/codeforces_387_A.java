```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input time 1 in hours and minutes
        String[] time1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);

        // Convert time 1 to total minutes
        m1 += h1 * 60;

        // Input time 2 in hours and minutes
        String[] time2 = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);

        // Convert time 2 to total minutes
        m2 += h2 * 60;

        // Calculate the difference in minutes
        m2 = m1 - m2;

        // Adjust the result to be within 0 to 1440 minutes (24 hours)
        m2 %= 1440;

        // Convert the result back to hours and minutes
        int hours = m2 / 60;
        int minutes = m2 % 60;

        // Print the result in the format HH:MM
        System.out.printf("%02d:%02d", hours, minutes);
    }
}
```
