```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int divisor = 10;
        int p = 123;
        int result = calculateFloorDivision(divisor, p);
        System.out.println(result);
    }

    public static int calculateFloorDivision(int divisor, int p) {
        return p / divisor;
    }
}
```
