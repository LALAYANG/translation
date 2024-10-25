<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8 9

Expected output:
2


```
a , b = map ( int , input ( ).split ( ) )
hole = 1
i = 0
check = True
while check :
    if hole >= b :
        check = False
    else :
        hole = a * ( i + 1 ) - i
        i += 1
print ( i )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            if (hole >= b) {
                check = false;
            } else {
                hole = a * (i + 1) - i;
                i++;
            }
        }
        System.out.println(i);
    }
}
```

This Java code does the same thing as the provided Python code. It reads two integers from the standard input, performs some calculations, and prints the result. The logic of the calculations is the same as in the Python code. <｜end▁of▁sentence｜>
