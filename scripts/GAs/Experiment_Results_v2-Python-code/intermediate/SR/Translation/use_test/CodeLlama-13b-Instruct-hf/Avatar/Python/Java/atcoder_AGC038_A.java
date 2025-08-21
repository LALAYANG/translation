
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        char[][] answer = new char[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = '0';
                            } else {
                                answer[i][j] = '1';
                            }
                        } else if (j < A) {
                            answer[i][j] = '1';
                        } else {
                            answer[i][j] = '0';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(answer[i]);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the console, and the `char[][]` data type to represent the 2D array of characters. The `solve` method is similar to the Python `solve` function, but it uses Java's bitwise operators (`&`) to perform the bitwise AND operations.
