<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Alex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][2];
        for (int i = 0; i < n; i++) {
            m[i][0] = sc.nextInt();
            m[i][1] = sc.nextInt();
        }
        Arrays.sort(m, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        });
        int a = m[0][1];
        for (int i = 1; i < n; i++) {
            if (m[i][1] > a) {
                System.out.println("Happy Alex");
                break;
            }
            a = m[i][1];
        } else {
            System.out.println("Poor Alex");
        }
    }
}
```
Note: The `Comparator` interface is used to sort the 2D array `m` based on the second element of each subarray. The `Integer.compare()` method is used to compare the second elements of the subarrays.</s>
