<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
76
27 73 53 62 35 52 20 1 17 13 74 56 72 61 63 31 70 46 8 7 69 37 75 76 45 57 6 71 11 66 39 19 48 34 64 40 58 43 47 16 50 59 33 29 51 55 25 12 9 4 2 24 5 14 30 28 21 10 23 68 41 36 60 54 3 49 65 26 18 22 42 32 15 67 38 44

Expected output:
18526


```
root = lambda x : x if par [ x ] == x else root ( par [ x ] )
same = lambda x , y : root ( x ) == root ( y )
def unite ( * z ) :
    x , y = map ( root , z )
    if x != y :
        if rank [ x ] < rank [ y ] :
            par [ x ] = y
            size [ y ] += size [ x ]
        else :
            par [ y ] = x
            size [ x ] += size [ y ]
            if rank [ x ] == rank [ y ] : rank [ x ] += 1
n , * a = map ( int , open ( 0 ).read ( ).split ( ) )
* par , = range ( n )
rank = [ 1 ] * n
size = [ 1 ] * n
b = [ 0 ] * n
for i , t in enumerate ( a ) : b [ t - 1 ] = i
c = 0
for k in b [ : : - 1 ] :
    l = r = 1
    if k > 0 and a [ k - 1 ] > a [ k ] :
        l += size [ root ( k - 1 ) ]
        unite ( k - 1 , k )
    if k + 1 < n and a [ k + 1 ] > a [ k ] :
        r += size [ root ( k + 1 ) ]
        unite ( k + 1 , k )
    c += l * r * a [ k ]
print ( c )


```

### Response:
```java
import java.util.*;

public class Main {
    static int[] par;
    static int[] rank;
    static int[] size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += (long) l * r * a[k];
        }
        System.out.println(c);
    }

    static int root(int x) {
        return par[x] == x ? x : root(par[x]);
    }

    static boolean same(int x, int y) {
        return root(x) == root(y);
    }

    static void unite(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }
    }
}
```
<|EOT|>
