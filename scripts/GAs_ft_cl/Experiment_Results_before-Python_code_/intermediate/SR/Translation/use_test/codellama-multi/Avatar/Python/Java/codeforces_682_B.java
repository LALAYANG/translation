 ```java
import java.util.Scanner ; public class atcoder_ABC159_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int c = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] > c ) { c ++ ; } } System.out.println ( c + 1 ) ; } }

```
