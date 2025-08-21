```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] first_time = sc.nextLine().split(":");
        String[] second_time = sc.nextLine().split(":");
        int first_hour = Integer.parseInt(first_time[0]);
        int first_minute = Integer.parseInt(first_time[1]);
        int second_hour = Integer.parseInt(second_time[0]);
        int second_minute = Integer.parseInt(second_time[1]);
        int minutes_per_hour = 60;
        first_minute += calculate_product(first_hour, minutes_per_hour);
        second_minute += second_hour * 60;
        int m2 = first_minute - second_minute;
        m2 = m2 % 1440;
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }

    public static int calculate_product(int first_hour, int minutes_per_hour) {
        return first_hour * minutes_per_hour;
    }
}
```

