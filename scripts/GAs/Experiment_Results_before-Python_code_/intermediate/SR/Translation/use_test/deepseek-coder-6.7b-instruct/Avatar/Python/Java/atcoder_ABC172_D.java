```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (long) (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

In the Java code, we use the Scanner class to read the input. The logic of the code remains the same as the Python code. The only difference is that we need to cast N / i to long to avoid integer division. Also, we need to cast the result of the multiplication to long to avoid overflow.

