<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
101 171 1 1000000000

Expected output:
57900

```
def G ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def L ( a , b ) :
    return a * b // G ( a , b )
l = input ( ).split ( ' ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = L ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int lcm = L(x, y);
        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int G(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int L(int a, int b) {
        return a * b / G(a, b);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the least common multiple (LCM) of the first two numbers, and then prints the number of times the LCM divides into the range between the third and fourth numbers (inclusive). <｜end▁of▁sentence｜>
