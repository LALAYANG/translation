<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321

Expected output:
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479


```
def substract ( a , b ) :
    if a > b :
        total = 0
        while a > 0 and b > 0 :
            total += int ( a / b )
            a = a % b
            if a > 0 :
                total += int ( b / a )
                b = b % a
        return total
    if a < b :
        total = 0
        while a > 0 and b > 0 :
            total += int ( b / a )
            b = b % a
            if b > 0 :
                total += int ( a / b )
                a = a % b
        return total
    if a == b :
        return 1
n = int ( input ( ) )
lst = [ ]
for i in range ( 0 , n ) :
    a , b = map ( int , input ( ).split ( ) )
    lst.append ( substract ( a , b ) )
for i in lst :
    print ( i )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            lst[i] = substract(a, b);
        }
        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static int substract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        }
        if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        }
        if (a == b) {
            return 1;
        }
        return 0;
    }
}
```

This Java code does the same thing as your Python code. It reads the number of test cases, then for each test case, it reads two integers and calls the `substract` method. The result is stored in an array and then printed out.
<|EOT|>
