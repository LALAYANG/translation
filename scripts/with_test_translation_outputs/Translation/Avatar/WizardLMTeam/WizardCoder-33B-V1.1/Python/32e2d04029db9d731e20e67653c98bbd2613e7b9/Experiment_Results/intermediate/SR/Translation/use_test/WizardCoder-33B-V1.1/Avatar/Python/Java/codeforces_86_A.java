<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
66 95

Expected output:
2178

```
l , r = [ int ( x ) for x in input ( ).split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ''
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s += 1;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then it calculates the maximum possible product of a number and its reversed version within the given range. The reversed version of a number is obtained by replacing each digit with its complement to 9. For example, the reversed version of 246 is 353 (6 becomes 3, 4 becomes 5, 2 becomes 3). <｜end▁of▁sentence｜>
