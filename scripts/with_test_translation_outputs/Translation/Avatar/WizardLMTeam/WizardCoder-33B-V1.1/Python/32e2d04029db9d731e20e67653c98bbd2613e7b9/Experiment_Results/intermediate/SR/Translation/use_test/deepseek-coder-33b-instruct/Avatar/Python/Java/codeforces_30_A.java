<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        return -1001; // return a value that is not a valid solution
    }
}
```

This Java code reads three integers from the standard input, calls the `task4` function with these integers as arguments, and prints the result. The `task4` function iterates over the range from -1000 to 1000, and for each integer X, it checks if A times X to the power of n equals B. If it finds such an X, it returns X. If it doesn't find any such X, it returns -1001, which is not a valid solution.
<|EOT|>
