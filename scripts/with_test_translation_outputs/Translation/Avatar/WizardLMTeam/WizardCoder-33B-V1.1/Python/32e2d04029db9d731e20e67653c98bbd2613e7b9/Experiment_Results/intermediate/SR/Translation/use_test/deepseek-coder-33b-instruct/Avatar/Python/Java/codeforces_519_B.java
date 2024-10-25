<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
6
1 4 3 3 5 7
3 7 5 4 3
4 3 7 5

Expected output:
1
3


```
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
b = list ( map ( int , input ( ).split ( ) ) )
c = list ( map ( int , input ( ).split ( ) ) )
x = 0
y = 0
z = 0
for i in a :
    x += i
for i in b :
    y += i
for i in c :
    z += i
print ( abs ( x - y ) )
print ( abs ( y - z ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i : a) {
            x += i;
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            z += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```
<|EOT|>
