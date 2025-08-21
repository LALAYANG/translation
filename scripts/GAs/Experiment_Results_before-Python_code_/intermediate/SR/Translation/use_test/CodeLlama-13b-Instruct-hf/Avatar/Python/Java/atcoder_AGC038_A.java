```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join("", answer[i]));
        }
    }
}
```
This is a solution to the problem in Java. It uses the `Scanner` class to read the input from the user, and the `String.join()` method to print the output. The `solve()` method takes the input parameters `H`, `W`, `A`, and `B`, and uses a nested loop to iterate over the rows and columns of the 2D array `answer`. It sets the value of each element in the array based on the conditions given in the problem statement. Finally, it prints the output using the `System.out.println()` method.
