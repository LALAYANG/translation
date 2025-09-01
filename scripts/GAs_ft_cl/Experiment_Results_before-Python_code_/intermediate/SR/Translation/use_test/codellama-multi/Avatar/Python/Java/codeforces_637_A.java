 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int max = 0 ; int index = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] > max ) { max = a [ i ] ; index = i ; } } System.out.println ( a [ index ] ) ; } }

```
