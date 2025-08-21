```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        for (String i : m) {
            int count = 0;
            for (String j : m) {
                if (i.equals(j)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

Test input:
10
324 539 83 440 834 640 440 440 440 440

Expected output:
NO 
