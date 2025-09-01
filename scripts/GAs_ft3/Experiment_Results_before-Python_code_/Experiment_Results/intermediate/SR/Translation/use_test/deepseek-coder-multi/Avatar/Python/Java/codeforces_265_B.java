```

import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int ans = n - 1 ; int last = 0 ; for ( int i = 0 ; i < n ; i ++ ) { ans += Math.abs ( last - a [ i ] ) + 1 ; last = a [ i ] ; } System.out.println ( ans ) ; } }

```
