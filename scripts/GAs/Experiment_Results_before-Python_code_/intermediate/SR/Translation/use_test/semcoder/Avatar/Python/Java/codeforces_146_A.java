To solve this problem, we need to translate the given Python code into Java. Here is the step-by-step plan to achieve this:

1. Read the input integer `n`.
2. Read the input string of numbers and convert it into a list of integers.
3. Initialize variables `h1`, `h2`, and `x`.
4. Iterate over the list of numbers and check if each number is either 4 or 7. If not, print "NO" and increment `x`.
5. If `x` is still 0, check if the number is within the first half of the list.
6. If it is, add the number to `h1`; otherwise, add it to `h2`.
7. If no "NO" was printed, check if `h1` is equal to `h2`. If so, print "YES"; otherwise, print "NO".

Here is the Java solution based on the translated code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }
        
        int h1 = 0, h2 = 0, x = 0;
        for (int i = 0; i < n; i++) {
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

You can run this Java code to verify the correctness of the solution.
