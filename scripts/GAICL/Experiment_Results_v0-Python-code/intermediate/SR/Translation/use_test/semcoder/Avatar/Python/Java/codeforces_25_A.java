To solve this problem, we need to read the input integer `n` and the list of integers `remainder_list`. We then calculate the remainder of each element in the list with 2 and store the results in `remainder_list`. Next, we check if the sum of the `remainder_list` is equal to 1. If it is, we print the index of the element with value 1 in the list, else we print the index of the element with value 0.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] remainder_list = new int[n];
        
        for (int i = 0; i < n; i++) {
            remainder_list[i] = scanner.nextInt() % 2;
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += remainder_list[i];
        }
        
        if (sum == 1) {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (remainder_list[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
```

This solution reads the input, calculates the remainders, and then determines the index of the element with the desired value (0 or 1) to output the result.
