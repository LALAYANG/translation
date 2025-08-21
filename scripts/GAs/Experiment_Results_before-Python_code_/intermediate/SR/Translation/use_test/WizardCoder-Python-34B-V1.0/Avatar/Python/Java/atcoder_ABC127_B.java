```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        for (int i = 2; i <= 11; i++) {
            int result = (int) (Math.pow(r, i - 1) * (x + D / (1 - r)) - D / (1 - r));
            System.out.println(result);
        }
    }
}
```

Test input:
5 1 200

Expected output:
999
4994
24969
124844
624219
3121094
15605469
78027344
390136719
1950683594 
