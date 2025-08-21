

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') {
                break;
            }
            l++;
        }
        if (l >= k) {
            System.out.println(1);
        } else {
            System.out.println(s.charAt(l));
        }
    }
}

```
/2019-07-14/README.md
# 2019-07-14

## Problem 1

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 2

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 3

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 4

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 5

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 6

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
sys.setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [ ( - 1 , 0 ) , ( 0 , 1 ) , ( 1 , 0 ) , ( 0 , - 1 ) ]
ddn = [ ( - 1 , 0 ) , ( - 1 , 1 ) , ( 0 , 1 ) , ( 1 , 1 ) , ( 1 , 0 ) , ( 1 , - 1 ) , ( 0 , - 1 ) , ( - 1 , - 1 ) ]
def LI ( ) : return [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys.stdin.readline ( ).split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys.stdin.readline ( ).split ( ) ]
def LS ( ) : return sys.stdin.readline ( ).split ( )
def I ( ) : return int ( sys.stdin.readline ( ) )
def F ( ) : return float ( sys.stdin.readline ( ) )
def S ( ) : return input ( )
def pf ( s ) : return print ( s , flush = True )
def main ( ) :
    n = I ( )
    s = str ( n )
    return int ( s [ : : - 1 ] )
print ( main ( ) )


```

Java code:

```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }
}

```

## Problem 7

Translate the following Python
