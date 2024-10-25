<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
7 5 5

Expected output:
YES


```
ABC = tuple ( map ( int , input ( ).split ( ) ) )
if ABC.count ( 5 ) == 2 :
    print ( 'YES' if sum ( ABC ) == 17 else 'NO' )
else :
    print ( 'NO' )


```

### Response:
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (ABC[i] == 5) {
                count++;
            }
            sum += ABC[i];
        }
        if (count == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, counts the number of times 5 appears in the input, and checks if the sum of the three numbers is 17. If both conditions are met, it prints "YES", otherwise it prints "NO". <｜end▁of▁sentence｜>
