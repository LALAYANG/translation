```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        int h1 = 0, h2 = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] != 4 && number[i] != 7) {
                System.out.println("NO");
                break;
            }
            if (i < n / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
        if (h1 == h2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value from the input. The `for` loop is used to iterate over the input array and calculate the sum of the first half and the second half of the array. The `if` statement is used to check if the sum of the first half is equal to the sum of the second half, and the `System.out.println()` method is used to print the result.
