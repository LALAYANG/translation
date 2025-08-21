```
import java.util.Scanner;

public class TimeDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first time: ");
        String time1 = scanner.nextLine();
        System.out.print("Enter second time: ");
        String time2 = scanner.nextLine();

        int h1 = Integer.parseInt(time1.split(":")[0]);
        int m1 = Integer.parseInt(time1.split(":")[1]);
        int h2 = Integer.parseInt(time2.split(":")[0]);
        int m2 = Integer.parseInt(time2.split(":")[1]);

        int totalMinutes1 = h1 * 60 + m1;
        int totalMinutes2 = h2 * 60 + m2;
        int difference = totalMinutes1 - totalMinutes2;

        int hours = difference / 60;
        int minutes = difference % 60;

        System.out.println(hours + ":" + minutes);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input strings into hours and minutes using the `split` method. It then calculates the total minutes for each time using the formula `hours * 60 + minutes`. Finally, it calculates the difference between the two times and prints the result in the format `hours:minutes`.
