```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format: HH:MM
        String firstTime = scanner.nextLine();
        String secondTime = scanner.nextLine();

        int firstHour = Integer.parseInt(firstTime.substring(0, 2));
        int firstMinute = Integer.parseInt(firstTime.substring(3));

        int secondHour = Integer.parseInt(secondTime.substring(0, 2));
        int secondMinute = Integer.parseInt(secondTime.substring(3));

        int totalMinutes = firstMinute + (firstHour * 60) - (secondMinute + (secondHour * 60));
        totalMinutes = totalMinutes % 1440;

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.printf("%02d:%02d", hours, minutes);
    }
}
```
