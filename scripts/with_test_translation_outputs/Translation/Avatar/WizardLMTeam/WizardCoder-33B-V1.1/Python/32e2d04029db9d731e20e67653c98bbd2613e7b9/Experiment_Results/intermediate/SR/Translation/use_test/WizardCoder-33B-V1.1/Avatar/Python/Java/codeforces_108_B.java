<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
421 250 398 257 512 329 25 972

Expected output:
YES


```
def s ( ) :
    input ( )
    a = list ( map ( int , input ( ).split ( ) ) )
    a.sort ( )
    for i in range ( 1 , len ( a ) ) :
        if a [ i ] != a [ i - 1 ] and a [ i ] < a [ i - 1 ] * 2 :
            return 'YES'
    return 'NO'
print ( s ( ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(s(a));
    }

    public static String s(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                return "YES";
            }
        }
        return "NO";
    }
}
```

This Java code does the same thing as your Python code. It reads an integer n from the input, then reads n integers into an array a. It sorts the array and then calls the s function, which checks if there are any two adjacent elements in the array such that the first element is less than twice the second element. If such a pair exists, it returns "YES", otherwise it returns "NO". <｜end▁of▁sentence｜>
