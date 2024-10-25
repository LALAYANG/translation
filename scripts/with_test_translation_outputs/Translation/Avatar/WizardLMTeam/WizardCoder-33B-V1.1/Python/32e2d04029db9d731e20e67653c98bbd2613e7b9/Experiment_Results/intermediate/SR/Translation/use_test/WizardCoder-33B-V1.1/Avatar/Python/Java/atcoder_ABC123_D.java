<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2 2 2 8
4 6
1 5
3 8

Expected output:
19
17
15
14
13
12
10
8


```
x , y , z , k = [ int ( _ ) for _ in input ( ).split ( ) ]
a = [ int ( _ ) for _ in input ( ).split ( ) ]
b = [ int ( _ ) for _ in input ( ).split ( ) ]
c = [ int ( _ ) for _ in input ( ).split ( ) ]
ab = [ ]
for i in range ( x ) :
    for j in range ( y ) :
        ab.append ( a [ i ] + b [ j ] )
ab.sort ( reverse = True )
abc = [ ]
for i in range ( min ( k , x * y ) ) :
    for j in range ( z ) :
        abc.append ( ab [ i ] + c [ j ] )
abc.sort ( reverse = True )
for i in range ( k ) :
    print ( abc [ i ] )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();

        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];

        for (int i = 0; i < x; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < y; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < z; i++) {
            c[i] = scanner.nextInt();
        }

        ArrayList<Integer> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a[i] + b[j]);
            }
        }

        Collections.sort(ab, Collections.reverseOrder());

        ArrayList<Integer> abc = new ArrayList<>();
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c[j]);
            }
        }

        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calculates the sums, sorts them in descending order, and prints the first k elements. <｜end▁of▁sentence｜>
