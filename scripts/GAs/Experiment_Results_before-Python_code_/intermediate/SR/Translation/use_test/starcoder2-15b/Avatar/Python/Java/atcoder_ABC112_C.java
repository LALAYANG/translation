

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = sc.nextInt();
            ls_xyh[i][1] = sc.nextInt();
            ls_xyh[i][2] = sc.nextInt();
        }
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            List<int[]> newCands = new ArrayList<>();
            for (int[] cand : cands) {
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] ans = cands.get(0);
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }
}

```

## 10. 1000000007

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 11. 1000000007 (2)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 12. 1000000007 (3)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 13. 1000000007 (4)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 14. 1000000007 (5)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 15. 1000000007 (6)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 16. 1000000007 (7)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 17. 1000000007 (8)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 18. 1000000007 (9)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 19. 1000000007 (10)

Write a program that reads an integer n and prints the value of n! modulo 1000000007.

A sample test case is provided below:

Test input:
10

Expected output:
3628800


```
import sys
def solve ( n ) :
    ans = 1
    for i in range ( 1 , n + 1 ) :
        ans = ( ans * i ) % 1000000007
    return ans
def readQuestion ( ) :
    ws = sys.stdin.readline ( ).strip ( ).split ( )
    n = int ( ws [ 0 ] )
    return ( n )
def main ( ) :
    print ( solve ( * readQuestion ( ) ) )
main ( )


```

Java code:

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % 1000000007;
        }
        System.out.println(ans);
    }
}

```

## 20. 1000000007 (11)

Write a program that reads an integer n and
