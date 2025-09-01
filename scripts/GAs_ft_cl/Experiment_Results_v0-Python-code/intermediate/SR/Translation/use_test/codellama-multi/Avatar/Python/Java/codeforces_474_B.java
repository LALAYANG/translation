 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int q = sc.nextInt ( ) ; int [ ] b = new int [ q ] ; for ( int i = 0 ; i < q ; i ++ ) { b [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < q ; i ++ ) { System.out.println ( a [ b [ i ] - 1 ] ) ; } } }

```
