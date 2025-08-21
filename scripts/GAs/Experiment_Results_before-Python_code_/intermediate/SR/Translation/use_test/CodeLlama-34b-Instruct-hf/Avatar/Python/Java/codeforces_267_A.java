```java
import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = subtract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int subtract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        } else if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. The `subtract` method is the same as the Python code, but the `main` method is different. In Java, we use a `Scanner` object to read input from the user, and we use a `for` loop to iterate over the input and call the `subtract` method for each pair of numbers. The `subtract` method returns the result of the subtraction, which is then printed to the console.
