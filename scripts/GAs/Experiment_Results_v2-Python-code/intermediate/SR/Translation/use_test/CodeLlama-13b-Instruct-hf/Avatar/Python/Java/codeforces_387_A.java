
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first time: ");
        String firstTime = scanner.nextLine();
        System.out.print("Enter the second time: ");
        String secondTime = scanner.nextLine();
        int firstHour = Integer.parseInt(firstTime.split(":")[0]);
        int firstMinute = Integer.parseInt(firstTime.split(":")[1]);
        int secondHour = Integer.parseInt(secondTime.split(":")[0]);
        int secondMinute = Integer.parseInt(secondTime.split(":")[1]);
        int difference = (secondHour - firstHour) * 60 + (secondMinute - firstMinute);
        System.out.println("The difference is " + difference + " minutes.");
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input strings into hours and minutes using the `split` method. It then calculates the difference between the two times in minutes and prints the result.

Note that this code assumes that the input times are in the format "HH:MM", where HH is the hour and MM is the minute. If the input times are in a different format, you will need to modify the code accordingly.
