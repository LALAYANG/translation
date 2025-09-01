 ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int ans = 1 ; int pos = 0 ; for ( int i = 1 ; i < n ; i ++ ) { if ( arr [ pos ] > arr [ i ] ) { ans ++ ; pos = i ; } } System.out.println ( ans ) ; } }

```
