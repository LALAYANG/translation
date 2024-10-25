<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
-1 -1 5

Expected output:
1

```
def task4 ( A , B , n ) :
    for X in range ( - 1000 , 1001 ) :
        if A * ( X ** n ) == B :
            return X
    return "No solution"
[ A , B , n ] = input ( ).split ( )
print ( task4 ( int ( A ) , int ( B ) , int ( n ) ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(task4(A, B, n));
    }

    public static int task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        return Integer.MIN_VALUE; // or return a specific value to indicate no solution
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calls the `task4` function with these integers, and prints the result. The `task4` function tries all integers from -1000 to 1000 as X, and checks if the equation `A * (X ** n) == B` is true for any of them. If it is, it returns X. If no such X is found, it returns `Integer.MIN_VALUE` to indicate that no solution was found. <｜end▁of▁sentence｜>
