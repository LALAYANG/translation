 ```java
import java.util.Scanner ; public class atcoder_ABC162_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; String v = sc.next ( ) ; String [ ] d = { "LEFT" , "RIGHT" } ; boolean f = k - 1 < n - k ; int m = Math.min ( k - 1 , n - k ) ; String [ ] a = new String [ m + v.length ( ) ] ; for ( int i = 0 ; i < m ; i ++ ) { a [ i ] = d [ f ? 1 : 0 ] ; } for ( int i = 0 ; i < v.length ( ) ; i ++ ) { a [ m + i ] = "PRINT " + v.charAt ( v.length ( ) - i - 1 ) ; a [ m + i + 1 ] = d [ f ? 0 : 1 ] ; } for ( int i = 0 ; i < a.length - 1 ; i ++ ) { System.out.println ( a [ i ] ) ; } } }

```
