<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1
10
1
11

Expected output:
0


```
princess = int ( input ( ) )
dragon = int ( input ( ) )
t = int ( input ( ) )
f = int ( input ( ) )
c = int ( input ( ) )
if dragon <= princess :
    print ( 0 )
    exit ( 0 )
result = 0
position = t * princess
position += princess * position / ( dragon - princess )
while position < c :
    result += 1
    position += princess * position / dragon
    position += princess * f
    position += princess * position / ( dragon - princess )
print ( result )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int princess = scanner.nextInt();
        int dragon = scanner.nextInt();
        int t = scanner.nextInt();
        int f = scanner.nextInt();
        int c = scanner.nextInt();
        if (dragon <= princess) {
            System.out.println(0);
            System.exit(0);
        }
        int result = 0;
        double position = t * princess;
        position += princess * position / (dragon - princess);
        while (position < c) {
            result += 1;
            position += princess * position / dragon;
            position += princess * f;
            position += princess * position / (dragon - princess);
        }
        System.out.println(result);
    }
}
```
<|EOT|>
