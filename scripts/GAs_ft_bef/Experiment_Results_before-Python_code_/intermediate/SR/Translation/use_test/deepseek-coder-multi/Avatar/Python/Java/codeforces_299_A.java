```

import java.util.Scanner ; public class codeforces_69_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int n = in.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = in.nextInt ( ) ; } boolean flag = true ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] != arr [ 0 ] ) { flag = false ; break ; } count ++ ; } if ( flag ) { System.out.println ( arr [ 0 ] ) ; } else { System.out.println ( - 1 ) ; } } }

```
