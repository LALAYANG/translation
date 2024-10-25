<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4

Expected output:
1 16 2 15
3 14 4 13
5 12 6 11
7 10 8 9


```
n = int ( input ( ) )
i , j = 1 , n * n
while i < j :
    print ( i , j )
    i += 1
    j -= 1


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, j = n * n;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then prints pairs of numbers from 1 to n^2 in increasing order and from n^2 to 1 in decreasing order. <｜end▁of▁sentence｜>
