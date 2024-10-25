<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2 2 2 1 1

Expected output:
1
2
1
1
1


```
import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
c = 2
for i in w :
    if i == 1 :
        print ( c )
    elif i % 2 == 0 :
        c = 3 - c
        print ( c )
    else :
        print ( c )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` integers into an array `w`. It then iterates over the array `w`, and for each integer `i` in `w`, it prints `c` and possibly changes `c`. If `i` is 1, it just prints `c`. If `i` is even, it changes `c` to `3 - c` and then prints `c`. If `i` is odd, it just prints `c`. <｜end▁of▁sentence｜>
