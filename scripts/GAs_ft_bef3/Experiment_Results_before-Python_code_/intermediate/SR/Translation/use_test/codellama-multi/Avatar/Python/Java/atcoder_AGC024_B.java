 [INST:perfect]
```
import java.util.Scanner ; public class codeforces_182_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int maxLen = 0 , ans = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( i > 0 && arr [ i - 1 ] + 1 == arr [ i ] ) { maxLen ++ ; } else { maxLen = 1 ; } if ( maxLen > ans ) { ans = maxLen ; } } System.out.println ( n - ans ) ; } }

```
