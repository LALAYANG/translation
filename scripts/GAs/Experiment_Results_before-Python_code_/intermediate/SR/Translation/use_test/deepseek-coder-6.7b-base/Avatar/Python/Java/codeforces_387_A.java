
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] time1 = sc.nextLine().split(":");
        String[] time2 = sc.nextLine().split(":");
        int h1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int h2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        int m1_total = h1 * 60 + m1;
        int m2_total = h2 * 60 + m2;
        int diff = m1_total - m2_total;
        if (diff < 0) {
            diff += 1440;
        }
        int h = diff / 60;
        int m = diff % 60;
        System.out.printf("%02d:%02d", h, m);
    }
}

```

