<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2 0 4 5

Expected output:
3


```
a = list ( map ( int , input ( ).split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then iterates over the array, and when it finds a zero, it prints the index of that zero plus one (because array indices in Java are zero-based).
<|EOT|>
