```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] q = new String[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            q[i] = scanner.next().split(" ");
        }
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (j == k) {
                    continue;
                }
                if (q[j][0].equals(q[k][1]) || q[j][1].equals(q[k][0])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

Test input:
23
43 78
31 28
58 80
66 63
20 4
51 95
40 20
50 14
5 34
36 39
77 42
64 97
62 89
16 56
8 34
58 16
37 35
37 66
8 54
50 36
24 8
68 48
85 33

Expected output:
6 
