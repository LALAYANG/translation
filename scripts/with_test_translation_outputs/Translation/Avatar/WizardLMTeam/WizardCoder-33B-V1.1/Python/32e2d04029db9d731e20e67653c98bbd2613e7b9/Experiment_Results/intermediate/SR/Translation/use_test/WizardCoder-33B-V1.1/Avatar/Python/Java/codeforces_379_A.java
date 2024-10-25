<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2

Expected output:
5


```
import re
candeleIntere , b = map ( int , input ( ).split ( ) )
s = 0
restoSciolte = 0
while candeleIntere > 0 or restoSciolte >= b :
    candeleIntere += restoSciolte // b
    restoSciolte %= b
    s += candeleIntere
    restoSciolte += candeleIntere % b
    candeleIntere //= b
print ( s )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
    }
}
``` <｜end▁of▁sentence｜>
