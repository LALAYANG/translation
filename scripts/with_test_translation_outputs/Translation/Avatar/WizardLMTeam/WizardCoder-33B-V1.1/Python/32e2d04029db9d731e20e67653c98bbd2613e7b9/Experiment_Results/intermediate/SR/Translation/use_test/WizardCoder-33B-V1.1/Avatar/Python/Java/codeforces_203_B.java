<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1


```
def solve_case ( ) :
    n , m = map ( int , input ( ).split ( ) )
    count = [ None ] * n
    for i in range ( n ) :
        count [ i ] = [ 0 ] * n
    ans = - 1
    for k in range ( m ) :
        x , y = map ( int , input ( ).split ( ) )
        x -= 1
        y -= 1
        found = False
        for i in range ( x - 2 , x + 1 ) :
            for j in range ( y - 2 , y + 1 ) :
                if i >= 0 and i < n and j >= 0 and j < n :
                    count [ i ] [ j ] += 1
                    if count [ i ] [ j ] == 9 :
                        found = True
        if found :
            ans = k + 1
            break
    print ( ans )
solve_case ( )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        int ans = -1;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, initializes the count array, and then iterates over the input points. For each point, it increments the count of the 9 cells around the point (if they exist). If any of these cells reach 9, it sets the answer to the current step and breaks the loop. Finally, it prints the answer. <｜end▁of▁sentence｜>
