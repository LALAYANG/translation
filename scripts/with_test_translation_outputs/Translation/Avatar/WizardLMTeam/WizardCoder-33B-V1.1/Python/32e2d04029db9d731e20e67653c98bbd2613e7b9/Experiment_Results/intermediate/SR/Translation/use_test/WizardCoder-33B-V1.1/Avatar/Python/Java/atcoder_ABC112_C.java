<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
2 3 5
2 1 5
1 2 5
3 2 5

Expected output:
2 2 6


```
import sys
def solve ( n , ls_xyh ) :
    x0 = None
    for i in range ( n ) :
        if ls_xyh [ i ] [ 2 ] > 0 :
            [ x0 , y0 , h0 ] = ls_xyh [ i ]
            break
    cands = [ ( cx , cy , h0 + abs ( cx - x0 ) + abs ( cy - y0 ) ) for cx in range ( 101 ) for cy in range ( 101 ) ]
    for [ x , y , h ] in ls_xyh :
        cands = [ ( cx , cy , ch ) for ( cx , cy , ch ) in cands if max ( ch - abs ( cx - x ) - abs ( cy - y ) , 0 ) == h ]
    ( xx , yy , hh ) = cands [ 0 ]
    return ' '.join ( [ str ( xx ) , str ( yy ) , str ( hh ) ] )
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    ls_xyh = [ list ( map ( int , sys.stdin.readline ( ).strip ( ).split ( ) ) ) for j in range ( n ) ]
    return ( n , ls_xyh )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = sc.nextInt();
            }
        }
        solve(n, ls_xyh);
    }

    public static void solve(int n, int[][] ls_xyh) {
        int x0 = 0, y0 = 0, h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] xyh : ls_xyh) {
            int x = xyh[0], y = xyh[1], h = xyh[2];
            cands.removeIf(cand -> Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) != h);
        }
        int[] res = cands.get(0);
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
}
```

This Java code does the same thing as your Python code. It reads the input, calls the `solve` method with the input, and prints the result. The `solve` method calculates the possible coordinates and heights of the tower, then filters out the impossible ones based on the given conditions. The first possible coordinate is then printed. <｜end▁of▁sentence｜>
