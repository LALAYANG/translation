<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvvjvjjjjjmmbmbbbbbmbbbbmm
5
mb
ho
xu
jv
yp

Expected output:
37


```
s = input ( )
n = int ( input ( ) )
ans = 0
for i in range ( n ) :
    x = input ( )
    a , b = 0 , 0
    for j in s :
        if j == x [ 0 ] :
            a += 1
        elif j == x [ 1 ] :
            b += 1
        else :
            ans = ans + min ( a , b )
            a , b = 0 , 0
    ans = ans + min ( a , b )
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            int a = 0, b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == x.charAt(0)) {
                    a++;
                } else if (s.charAt(j) == x.charAt(1)) {
                    b++;
                } else {
                    ans += Math.min(a, b);
                    a = 0;
                    b = 0;
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string and an integer from the user, then reads n pairs of characters. For each pair of characters, it counts the number of times each character appears in the string, and adds the minimum of the two counts to the total. The total is then printed out. <｜end▁of▁sentence｜>
