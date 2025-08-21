```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int multiplier = scanner.nextInt();
        int d = scanner.nextInt();
        int result = Math.max(a * multiplier, b * d);
        result = Math.max(result, a * d);
        result = Math.max(result, b * multiplier);
        System.out.println(result);
    }
}
``` 
