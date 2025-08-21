```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= t) {
            currentCell += s[currentCell - 1];
            if (currentCell == t) {
                System.out.println("YES");
                break;
            }
        }
        if (currentCell > t) {
            System.out.println("NO");
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output. The `break` statement is used to exit the loop when the condition is met.
