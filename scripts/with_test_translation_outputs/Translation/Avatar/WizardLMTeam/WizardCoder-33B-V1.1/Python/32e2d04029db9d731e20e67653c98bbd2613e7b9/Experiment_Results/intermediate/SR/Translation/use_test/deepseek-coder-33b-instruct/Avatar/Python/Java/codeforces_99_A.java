<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9.1

Expected output:
GOTO Vasilisa.

```
l = input ( )
l = l.split ( '.' )
s = list ( l [ 0 ] )
p = list ( l [ 1 ] )
i = int ( p [ 0 ] )
if s [ len ( s ) - 1 ] == '9' :
    print ( "GOTO Vasilisa." )
elif s [ len ( s ) - 1 ] != '9' and i < 5 :
    s = "".join ( s )
    print ( s )
else :
    s = "".join ( s )
    s = str ( int ( s ) + 1 )
    print ( s )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        String str = String.valueOf(num);
        String[] parts = str.split("\\.");
        char[] integerPart = parts[0].toCharArray();
        int decimalPart = Integer.parseInt(String.valueOf(parts[1].charAt(0)));

        if (integerPart[integerPart.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (integerPart[integerPart.length - 1] != '9' && decimalPart < 5) {
            System.out.println(new String(integerPart));
        } else {
            integerPart[integerPart.length - 1]++;
            System.out.println(new String(integerPart));
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a double number from the standard input, splits it into an integer and a decimal part, and then checks the last digit of the integer part. If it's '9', it prints "GOTO Vasilisa.". If it's not '9' and the first digit of the decimal part is less than 5, it prints the integer part. Otherwise, it increments the last digit of the integer part and prints the result.
<|EOT|>
