<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst[i] = subtract(a, b);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(lst[i]);
        }
    }

    public static int subtract(int a, int b) {
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
        } else if (a < b) {
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
        } else {
            return 1;
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output. The `subtract()` method is a Java implementation of the `subtract()` function in the Python code.</s>
