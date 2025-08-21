```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long ans = 0;
        for (int currentNumber = 1; currentNumber <= N; currentNumber++) {
            ans += (long) currentNumber * (N / currentNumber) * (N / currentNumber + 1) / 2;
        }
        System.out.println(ans);
    }
}
```
