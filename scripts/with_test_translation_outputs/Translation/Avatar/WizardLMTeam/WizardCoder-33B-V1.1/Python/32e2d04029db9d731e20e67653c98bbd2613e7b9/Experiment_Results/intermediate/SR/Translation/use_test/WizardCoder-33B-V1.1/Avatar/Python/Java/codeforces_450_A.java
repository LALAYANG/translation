<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46


```
n , m = map ( int , input ( ).split ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l2 = [ ]
for i in l :
    if i % m == 0 :
        l2.append ( i // m )
    else :
        l2.append ( i // m + 1 )
mx = max ( l2 )
for i in range ( n ) :
    if l2 [ i ] == mx :
        ind = i
print ( ind + 1 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        int mx = Arrays.stream(l2).max().getAsInt();
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, performs the same operations on the input, and prints the result. The only difference is that in Java, we need to import the `java.util.Scanner` class to read the input, and we need to use `Arrays.stream(l2).max().getAsInt()` to find the maximum value in the array `l2`. <｜end▁of▁sentence｜>
