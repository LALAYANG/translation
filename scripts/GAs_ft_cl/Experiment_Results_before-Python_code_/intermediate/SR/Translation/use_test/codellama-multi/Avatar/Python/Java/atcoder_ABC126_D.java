 ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; b [ i ] = sc.nextInt ( ) ; } int [ ] c = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { c [ i ] = a [ i ] + b [ i ] ; } int [ ] d = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { d [ i ] = c [ i ] % 2 ; } for ( int i = 0 ; i < n ; i ++ ) { if ( d [ i ] == 0 ) { System.out.println ( 0 ) ; } else { System.out.println ( 1 ) ; } } } }

```
