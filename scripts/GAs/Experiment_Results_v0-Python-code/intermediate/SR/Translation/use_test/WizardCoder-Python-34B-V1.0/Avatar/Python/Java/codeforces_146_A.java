```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();
        int[] digits = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        int h1 = 0;
        int h2 = 0;
        int x = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (digits[i] != 4 && digits[i] != 7) {
                System.out.println("NO");
                found = true;
                break;
            }
            if (i < n / 2) {
                h1 += digits[i];
            } else {
                h2 += digits[i];
            }
        }
        if (!found) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
``` 
