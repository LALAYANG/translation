```java
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1, m1, h2, m2;

        // Get the first time
        System.out.print("Enter the first time (hh:mm): ");
        String[] time1 = sc.nextLine().split(":");
        h1 = Integer.parseInt(time1[0]);
        m1 = Integer.parseInt(time1[1]);

        // Get the second time
        System.out.print("Enter the second time (hh:mm): ");
        String[] time2 = sc.nextLine().split(":");
        h2 = Integer.parseInt(time2[0]);
        m2 = Integer.parseInt(time2[1]);

        // Calculate the difference in minutes
        int totalMinutes = (h1 * 60) + m1 - (h2 * 60) - m2;

        // Calculate the hours and minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Print the result
        System.out.println("The difference between " + time1[0] + ":" + time1[1] + " and " + time2[0] + ":" + time2[1] + " is " + hours + " hours and " + minutes + " minutes.");
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. We also use the `Integer.parseInt()` method to convert the input strings to integers. Finally, we use the modulo operator (`%`) to calculate the minutes.
