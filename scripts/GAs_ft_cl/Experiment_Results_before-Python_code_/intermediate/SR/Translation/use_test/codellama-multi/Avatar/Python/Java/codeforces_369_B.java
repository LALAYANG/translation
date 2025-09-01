 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int l = sc.nextInt ( ) ; int r = sc.nextInt ( ) ; int sa = sc.nextInt ( ) ; int sk = sc.nextInt ( ) ; int [ ] ans = new int [ n ] ; for ( int i = 0 ; i < k ; i ++ ) { ans [ i ] = sk / k + ( sk % k > i ? 1 : 0 ) ; } for ( int i = k ; i < n ; i ++ ) { ans [ i ] = sa / ( n - k ) + ( sa % ( n - k ) > i - k ? 1 : 0 ) ; } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( ans [ i ] + " " ) ; } } }

```
