<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            x += a[i];
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
            y += b[i];
        }

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
            z += c[i];
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```

This Java code does the same thing as the Python code. It reads three arrays of integers from the standard input, sums the elements of each array, and then prints the absolute difference between the sums of the first two arrays and the sums of the second and third arrays. <｜end▁of▁sentence｜>
