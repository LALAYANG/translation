
Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cookies = new int[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = scanner.nextInt();
        }
        int leftOver = cookies[0] - cookies[2];
        int takahashi = Math.max(0, leftOver);
        System.out.print(takahashi + " ");
        if (takahashi > 0) {
            System.out.print(cookies[1]);
        } else {
            System.out.print(Math.max(0, cookies[1] - Math.abs(leftOver)));
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it stores the input in an array of integers. It then calculates the left over cookies and the number of cookies that Takahashi can take, and prints the result.

Note that the `Math.max` method is used to ensure that the result is non-negative.
