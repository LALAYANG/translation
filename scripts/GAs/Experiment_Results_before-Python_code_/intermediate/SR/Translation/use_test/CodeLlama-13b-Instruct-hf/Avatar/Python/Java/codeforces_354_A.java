
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        int answer = QR * (n - 1) + sum_el[n] * R;
        for (int i = 1; i <= n; i++) {
            int energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
            if (i > (n - i)) {
                energy = energy + (i - (n - i) - 1) * QL;
            } else if ((n - i) > i) {
                energy = energy + ((n - i) - i - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `int[]` syntax is used to declare an array of integers. The `for` loop syntax is similar to the Python code, but the Java code uses curly braces to define the body of the loop. The `if` statement syntax is also similar to the Python code, but the Java code uses curly braces to define the body of the `if` statement.
