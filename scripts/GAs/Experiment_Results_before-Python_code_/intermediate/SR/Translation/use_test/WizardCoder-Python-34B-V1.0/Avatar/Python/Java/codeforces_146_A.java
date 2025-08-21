```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

Test input:
14
77770004444444

Expected output:
NO 
