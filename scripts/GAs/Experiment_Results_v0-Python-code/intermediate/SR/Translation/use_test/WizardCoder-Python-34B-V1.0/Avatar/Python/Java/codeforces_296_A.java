```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean isPossible = true;
        int CHECK_CONSTANT_2 = 557;
        int CHECK_CONSTANT_1 = 556;

        for (String element : m) {
            int count = 0;
            for (String s : m) {
                if (s.equals(element)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? "YES" : "NO");
    }
}
```

Test input:
10
324 539 83 440 834 640 440 440 440 440

Expected output:
YES 
