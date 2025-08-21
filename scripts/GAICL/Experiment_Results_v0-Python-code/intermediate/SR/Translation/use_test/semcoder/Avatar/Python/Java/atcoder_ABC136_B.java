```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;

        while (remainder % divisor == 1) {
            remainder++;
            while (Math.pow(10, i) <= N) {
                ans += (int) (Math.pow(10, i) - Math.pow(10, i - 1));
                i += 2;
            }
        }

        ans += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```
