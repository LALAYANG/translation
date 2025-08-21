```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```

Test input:
840783003083059124 0 327003145473120758

Expected output:
0 
