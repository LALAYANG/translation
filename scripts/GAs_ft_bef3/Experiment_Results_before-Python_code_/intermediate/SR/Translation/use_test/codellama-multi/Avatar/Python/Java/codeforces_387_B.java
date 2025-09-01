 ```java
import java.util.Scanner ; public class codeforces_131_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; int [ ] roundComplexity = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { roundComplexity [ i ] = sc.nextInt ( ) ; } int [ ] georgeComplexity = new int [ m ] ; for ( int i = 0 ; i < m ; i ++ ) { georgeComplexity [ i ] = sc.nextInt ( ) ; } int i = 0 ; int j = 0 ; while ( i < n && j < m ) { if ( roundComplexity [ i ] <= georgeComplexity [ j ] ) { i ++ ; } j ++ ; } System.out.println ( n - i ) ; } }

```
