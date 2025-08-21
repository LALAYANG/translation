
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt() * N + i;
        }
        sc.close();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int d = (A[i] % N) % 2;
            if (d % 2 != i % 2) {
                cnt++;
            }
        }
        System.out.println(cnt / 2);
    }
}
```
This code first reads the input from the user and stores it in an array `A`. It then iterates over the array and calculates the value of `d` for each element. If the value of `d` is not equal to the value of `i` modulo 2, it increments the variable `cnt`. Finally, it prints the value of `cnt` divided by 2.

Note that the code uses the `Scanner` class to read the input from the user, and the `System.out.println()` method to print the output.
