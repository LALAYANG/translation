<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12351 1223 6

Expected output:
2


```
t , s , q = map ( int , input ( ).split ( ) )
ans = 0
while ( s < t ) :
    s *= q
    ans += 1
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long s = scanner.nextLong();
        long q = scanner.nextLong();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans += 1;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the provided Python code. It reads three long integers from the standard input, performs the multiplication operation until the second number is not less than the first one, and then prints the number of performed multiplications. <｜end▁of▁sentence｜>
