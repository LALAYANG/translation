<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
14
77770004444444

Expected output:
NO


```
n = int ( input ( ) )
number = list ( map ( int , list ( input ( ) ) ) )
h1 = 0
h2 = 0
x = 0
for i in range ( n ) :
    if number [ i ] != 4 and number [ i ] != 7 :
        print ( "NO" )
        x += 1
        break
    if i < n // 2 :
        h1 += number [ i ]
    else :
        h2 += number [ i ]
if not x :
    if h1 == h2 :
        print ( "YES" )
    else :
        print ( "NO" )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int h1 = 0;
        int h2 = 0;
        boolean x = false;
        for (int i = 0; i < n; i++) {
            char c = number.charAt(i);
            if (c != '4' && c != '7') {
                System.out.println("NO");
                x = true;
                break;
            }
            if (i < n / 2) {
                h1 += c - '0';
            } else {
                h2 += c - '0';
            }
        }
        if (!x) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```
<|EOT|>
