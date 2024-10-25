<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
24 15

Expected output:
36


```
x , y = map ( int , input ( ).split ( ) )
print ( max ( x + y - 3 + ( ( y - x ) % 3 > 0 ) , 0 ) )
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
str_inp = lambda : input ( )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0 ? 1 : 0), 0));
    }
}
```
<|EOT|>
