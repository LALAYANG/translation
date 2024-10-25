<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12

Expected output:
12 6 3 1


```
n = int ( input ( ) )
for i in range ( n , 0 , - 1 ) :
    if n % i == 0 : n = i ; print ( i , end = ' ' )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                n = i;
                System.out.print(i + " ");
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then prints all the divisors of that integer in descending order. <｜end▁of▁sentence｜>
