```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        int[] remainderList = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            remainderList[i] = Integer.parseInt(numbers[i]) % 2;
            sum += remainderList[i];
        }
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (remainderList[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (remainderList[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```

