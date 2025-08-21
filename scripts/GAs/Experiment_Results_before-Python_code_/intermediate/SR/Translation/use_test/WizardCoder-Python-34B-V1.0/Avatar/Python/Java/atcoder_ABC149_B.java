```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cookies = scanner.nextLine().split(" ");
        int[] intCookies = new int[cookies.length];
        for (int i = 0; i < cookies.length; i++) {
            intCookies[i] = Integer.parseInt(cookies[i]);
        }
        int leftOver = intCookies[0] - intCookies[2];
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (intCookies[1] + " " + (Math.max(0, intCookies[1] - Math.abs(leftOver))));
    }
}
```

Test input:
500000000000 500000000000 1000000000000

Expected output:
0 0 
