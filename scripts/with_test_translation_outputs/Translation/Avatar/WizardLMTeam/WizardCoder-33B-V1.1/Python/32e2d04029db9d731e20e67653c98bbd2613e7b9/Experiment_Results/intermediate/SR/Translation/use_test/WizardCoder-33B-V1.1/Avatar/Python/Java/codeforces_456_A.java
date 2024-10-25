<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4586
2265 1619
2248 2692
1912 4276
4363 3024
4167 3817
3147 4270
457 161
3651 7
3899 1309
3866 4549
1505 2345
346 4224
3524 3020
2002 2034
1493 294
3545 439
4067 4226
1023 1487
763 359
1701 1777
950 3355
773 674
196 4389
3771 25
2595 405
2975 2736
3573 1581
3161 2252
667 549
4449 3394
3180 4327
1824 2618
1756 755
2703 3178
2282 2574
1919 902
3575 2338
2705 1918
3006 1799
1915 736
2869 3935
4163 2678
857 1018
983 577
2559 3094
1509 1538
3920 16
4465 2530
3679...
Expected output:
Happy Alex


```
n = int ( input ( ) )
m = [ [ int ( x ) for x in input ( ).split ( ) ] for i in range ( n ) ]
m.sort ( reverse = True )
a = m [ 0 ]
for i in m [ 1 : ] :
    if i [ 1 ] > a [ 1 ] :
        print ( 'Happy Alex' )
        break
    a = i
else :
    print ( 'Poor Alex' )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = scanner.nextInt();
            m[i][1] = scanner.nextInt();
        }
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        });
        int[] a = m[0];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a[1]) {
                System.out.println("Happy Alex");
                return;
            }
            a = m[i];
        }
        System.out.println("Poor Alex");
    }
}
```

This Java code does the same thing as the Python code. It reads in the number of pairs, then reads in each pair of numbers. It sorts the pairs in descending order by the first number in each pair. Then it iterates through the pairs, checking if the second number in each pair is greater than the second number in the previous pair. If it finds a pair where this is true, it prints "Happy Alex" and returns, otherwise it prints "Poor Alex" after checking all the pairs. <｜end▁of▁sentence｜>
