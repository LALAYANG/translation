```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long leftOver = a - c;
        long takahashi = Math.max(0, leftOver);

        System.out.println(takahashi + " " + (takahashi > 0 ? b : Math.max(0, b - Math.abs(leftOver))));
    }
}
```
