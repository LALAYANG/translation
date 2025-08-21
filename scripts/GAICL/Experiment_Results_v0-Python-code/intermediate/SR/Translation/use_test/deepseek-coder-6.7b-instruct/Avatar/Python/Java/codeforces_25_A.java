Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] remainderList = new int[n];
        for (int i = 0; i < n; i++) {
            remainderList[i] = scanner.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
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

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the input. It calculates the remainder of each of these integers when divided by 2 and stores the results in an array. It then checks if the sum of the array is 1. If it is, it prints the index of the first element in the array that is 1, otherwise it prints the index of the first element that is 0.

