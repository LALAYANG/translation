
Here is the Java code that translates the Python code:
```
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if ((A[i] >> b) & 1 == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to create an array of integers. It then iterates over each bit in the input array and calculates the number of ones and zeros in each bit. Finally, it calculates the result by summing the products of the number of ones and zeros in each bit, and modulo 1000000007 to ensure the result fits in a 32-bit integer.
