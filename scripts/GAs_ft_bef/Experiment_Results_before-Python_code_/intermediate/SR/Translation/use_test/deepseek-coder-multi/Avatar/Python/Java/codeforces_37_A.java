```java
import java.util.* ; import java.io.* ; public class codeforces_231_A { public static void main ( String [ ] args ) { Scanner scn = new Scanner ( System.in ) ; int n = scn.nextInt ( ) ; int a [ ] = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = scn.nextInt ( ) ; } Arrays.sort ( a ) ; int high = 1 , tower = 0 , maximum = 1 ; for ( int i = 1 ; i < n ; i ++ ) { if ( a [ i ] == a [ i - 1 ] ) { tower ++ ; high ++ ; } else { if ( high > maximum ) { maximum = high ; } high = 1 ; } } if ( high > maximum ) { maximum = high ; } System.out.println ( maximum + " " + ( n - tower ) ) ; } }

```
