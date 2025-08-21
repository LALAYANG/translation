```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if (((A[i] >> b) & 1) == 1) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }

        System.out.println(result);
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. You can also use `BufferedReader` or `InputStreamReader` to read input from the user.

Also, the above code uses the `long` data type to store the result, as the result can be a large number.

You can test the code by providing the input as follows:
```
10
3 1 4 1 5 9 2 6 5 3
```
The expected output is `237`.
