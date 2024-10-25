<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
0 1 1 0

Expected output:
2 1 1 2


```
p = input ( ).split ( " " )
x1 = int ( p [ 0 ] )
y1 = int ( p [ 1 ] )
x2 = int ( p [ 2 ] )
y2 = int ( p [ 3 ] )
DIF1 = x2 - x1
DIF2 = y2 - y1
x3 = x2 - DIF2
y3 = y2 + DIF1
x4 = x1 - DIF2
y4 = y1 + DIF1
print ( str ( x3 ) + " " + str ( y3 ) + " " + str ( x4 ) + " " + str ( y4 ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int DIF1 = x2 - x1;
        int DIF2 = y2 - y1;
        int x3 = x2 - DIF2;
        int y3 = y2 + DIF1;
        int x4 = x1 - DIF2;
        int y4 = y1 + DIF1;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a line of input, splits it into four integers, and then calculates four new integers based on the input. Finally, it prints out the new integers. <｜end▁of▁sentence｜>
