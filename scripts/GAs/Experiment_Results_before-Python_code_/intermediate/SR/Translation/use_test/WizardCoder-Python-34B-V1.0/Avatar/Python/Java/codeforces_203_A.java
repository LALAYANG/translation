```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        if (x == 0) {
            System.out.println("YES");
            System.out.println("Result Found");
        } else {
            int a_time = Math.min(a / da, t - 1);
            int b_time = Math.min(b / db, t - 1);
            for (int i = 0; i <= a_time; i++) {
                for (int j = 0; j <= b_time; j++) {
                    if (a - i * da == x || b - j * db == x) {
                        System.out.println("YES");
                        System.out.println("Result Found");
                        return;
                    }
                    if (a - i * da + b - j * db == x) {
                        System.out.println("YES");
                        System.out.println("Result Found");
                        return;
                    }
                }
            }
            System.out.println("NO");
            System.out.println("Result Not Found");
        }
    }
}
```

Test input:
5 4 11 80 2 4

Expected output:
YES 
