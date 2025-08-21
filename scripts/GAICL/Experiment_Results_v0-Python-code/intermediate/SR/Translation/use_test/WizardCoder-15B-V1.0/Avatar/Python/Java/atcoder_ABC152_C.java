```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(args[i+1]);
        }
        Arrays.sort(values);
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (values[pos] < values[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
```
