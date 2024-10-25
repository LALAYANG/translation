<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
..
1
1 2

Expected output:
1


```
soz = input ( )
a = [ 0 ] * ( len ( soz ) + 1 )
for i in range ( 1 , len ( soz ) ) :
    a [ i ] = a [ i - 1 ]
    if soz [ i - 1 ] == soz [ i ] :
        a [ i ] += 1
n = int ( input ( ) )
arr = [ ]
for i in range ( n ) :
    m , l = input ( ).split ( )
    arr.append ( a [ int ( l ) - 1 ] - a [ int ( m ) - 1 ] )
for i in arr :
    print ( i )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] ml = scanner.nextLine().split(" ");
            int m = Integer.parseInt(ml[0]);
            int l = Integer.parseInt(ml[1]);
            arr.add(a[l - 1] - a[m - 1]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string, then it creates an array where each element is the number of times a character is repeated up to that position in the string. Then it reads an integer `n` and `n` pairs of integers `m` and `l`, and for each pair it prints the difference between the number of repeated characters in the substring from the `m`-th position to the `l`-th position. <｜end▁of▁sentence｜>
