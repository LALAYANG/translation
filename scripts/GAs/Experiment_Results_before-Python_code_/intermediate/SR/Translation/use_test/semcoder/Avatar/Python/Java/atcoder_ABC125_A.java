```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputValues = input.nextLine().split(" ");
        int a = Integer.parseInt(inputValues[0]);
        int b = Integer.parseInt(inputValues[1]);
        int t = Integer.parseInt(inputValues[2]);

        int cookie = 0;
        double time = a;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}
```
