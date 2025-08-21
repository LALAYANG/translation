```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x++;
            n -= (int) Math.pow(2, (int) Math.log2(n));
        }
        System.out.println(x);
    }
}
```

Test input:
117422204

Expected output:
19 
