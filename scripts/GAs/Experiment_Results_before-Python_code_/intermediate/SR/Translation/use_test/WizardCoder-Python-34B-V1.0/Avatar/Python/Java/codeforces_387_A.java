```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hm1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(hm1[0]);
        int m1 = Integer.parseInt(hm1[1]);
        m1 += h1 * 60;
        String[] hm2 = scanner.nextLine().split(":");
        int h2 = Integer.parseInt(hm2[0]);
        int m2 = Integer.parseInt(hm2[1]);
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }
}
```

Test input:
07:12
05:55

Expected output:
01:17 
