<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) != '4' && number.charAt(i) != '7') {
                System.out.println("NO");
                x += 1;
                break;
            }
            if (i < n / 2) {
                h1 += number.charAt(i) - '0';
            } else {
                h2 += number.charAt(i) - '0';
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and a string `number` from the standard input, then checks if each character of `number` is either '4' or '7'. If not, it prints "NO" and breaks the loop. If the character is '4' or '7', it adds the numeric value of the character to either `h1` or `h2` depending on whether the index `i` is less than `n / 2`. Finally, it checks if `h1` and `h2` are equal, and prints "YES" if they are, and "NO" otherwise. <｜end▁of▁sentence｜>
