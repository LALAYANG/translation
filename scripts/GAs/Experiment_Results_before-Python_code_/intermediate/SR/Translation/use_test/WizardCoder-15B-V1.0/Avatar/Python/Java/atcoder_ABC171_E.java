```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int total = Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
        String[] result = Arrays.stream(a).mapToObj(x -> Integer.toString(x ^ total)).toArray(String[]::new);
        System.out.println(String.join(" ", result));
    }
}
```
