<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 23

Expected output:
Ciel


```
x , y = list ( map ( int , input ( ).split ( ) ) )
a = 0
while x >= 0 and y >= 22 or x >= 1 and y >= 12 or x >= 2 and y >= 2 :
    if a :
        if y >= 22 :
            y -= 22
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            x -= 2
            y -= 2
    else :
        if x >= 2 and y >= 2 :
            x -= 2
            y -= 2
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            y -= 22
    a = 1 - a
print ( [ 'Ciel' , 'Hanako' ] [ 1 - a ] )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        while (x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2) {
            if (a == 1) {
                if (y >= 22) {
                    y -= 22;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    x -= 2;
                    y -= 2;
                }
            } else {
                if (x >= 2 && y >= 2) {
                    x -= 2;
                    y -= 2;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    y -= 22;
                }
            }
            a = 1 - a;
        }
        System.out.println(a == 1 ? "Ciel" : "Hanako");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then enters a loop where it subtracts from `x` and `y` based on certain conditions. The loop continues until `x` and `y` meet certain conditions. After the loop, it prints "Ciel" if `a` is 1, and "Hanako" otherwise. <｜end▁of▁sentence｜>
