<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
``` <｜end▁of▁sentence｜>
