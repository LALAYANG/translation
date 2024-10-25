<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2
1 1

Expected output:
YES


```
import sys
n , t = map ( int , input ( ).split ( ) )
s = list ( [ int ( x ) for x in input ( ).split ( ) ] )
current_cell = 0
while current_cell <= t :
    current_cell += s [ current_cell - 1 ]
    if current_cell == t :
        print ( "YES" )
        sys.exit ( )
    else :
        continue
print ( "NO" )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 1;
        while (current_cell <= t) {
            current_cell += s[current_cell - 1];
            if (current_cell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads the number of cells and the target cell from the standard input, reads the cells array, and then iterates over the cells, updating the current cell based on the value in the current cell of the cells array. If the current cell ever equals the target cell, it prints "YES" and exits. If it never reaches the target cell, it prints "NO". <｜end▁of▁sentence｜>
