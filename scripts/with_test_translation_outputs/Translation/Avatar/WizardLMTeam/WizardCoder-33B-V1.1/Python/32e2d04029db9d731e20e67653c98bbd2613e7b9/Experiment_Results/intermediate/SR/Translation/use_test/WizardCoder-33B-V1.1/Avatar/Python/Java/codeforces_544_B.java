<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
34 621

Expected output:
NO


```
n , k = map ( int , input ( ).split ( ) )
x = 0
if k <= max ( n ** 2 // 2 , n ** 2 - ( n ** 2 // 2 ) ) :
    print ( 'YES' )
    for i in range ( n ) :
        for j in range ( n ) :
            if i % 2 == j % 2 and x < k :
                print ( 'L' , end = '' )
                x += 1
            else : print ( 'S' , end = '' )
        print ( )
else : print ( 'NO' )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int x = 0;
        if (k <= Math.max(n * n / 2, n * n - (n * n / 2))) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print("L");
                        x++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the provided Python code. It reads two integers from the standard input, checks if `k` is less than or equal to the maximum of `n^2/2` and `n^2 - n^2/2`, and if it is, it prints 'YES' and a chessboard-like pattern of 'L' and 'S' characters. If `k` is not less than or equal to this maximum, it prints 'NO'. <｜end▁of▁sentence｜>
