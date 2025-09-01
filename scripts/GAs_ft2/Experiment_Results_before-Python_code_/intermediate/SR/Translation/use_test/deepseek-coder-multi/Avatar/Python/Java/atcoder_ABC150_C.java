```

import java.util.* ; public class atcoder_ABC121_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] P = new int [ N ] ; int [ ] Q = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { P [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < N ; i ++ ) { Q [ i ] = sc.nextInt ( ) ; } int p = 0 ; int q = 0 ; for ( int i = 0 ; i < N ; i ++ ) { p += ( P [ i ] - 1 ) * Math.pow ( N - 1 , N - i - 1 ) ; q += ( Q [ i ] - 1 ) * Math.pow ( N - 1 , N - i - 1 ) ; } System.out.println ( Math.abs ( p - q ) ) ; } }

```
