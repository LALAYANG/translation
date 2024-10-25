<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
def binary_search ( key ) :
    bad , good = - 1 , len ( ans )
    while good - bad > 1 :
        mid = ( bad + good ) // 2
        if ans [ mid ] [ - 1 ] < key :
            good = mid
        else :
            bad = mid
    return good
N = int ( input ( ) )
ans = [ ]
for _ in range ( N ) :
    A = int ( input ( ) )
    idx = binary_search ( A )
    if idx == len ( ans ) :
        ans.append ( [ A ] )
    else :
        ans [ idx ].append ( A )
print ( len ( ans ) )


```
[/INST]
```java
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int key, int[][] ans) {
        int bad = -1, good = ans.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid][ans[mid].length - 1] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][];
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(A, ans);
            if (idx == ans.length) {
                ans[idx] = new int[1];
                ans[idx][0] = A;
            } else {
                ans[idx] = Arrays.copyOf(ans[idx], ans[idx].length + 1);
                ans[idx][ans[idx].length - 1] = A;
            }
        }
        System.out.println(ans.length);
    }
}
```
Note: In Java, we use `Arrays.copyOf()` method to create a new array with the same elements as the original array, but with an additional element at the end.

Also, in Java, we use `int[][]` to represent a 2D array, and `int[]` to represent a 1D array.

In the `binarySearch()` method, we use `ans[mid][ans[mid].length - 1]` to access the last element of the `mid`th row of the 2D array `ans`.</s>
