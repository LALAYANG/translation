```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainderList = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            remainderList[i] = scanner.nextInt() % 2;
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

This Java program does the same thing as the Python program. It reads the number of elements, then reads the elements and calculates the remainder of each element when divided by 2. It then sums up these remainders. If the sum is 1, it finds the index of the first 1 in the remainder list and prints it. If the sum is not 1, it finds the index of the first 0 in the remainder list and prints it.

