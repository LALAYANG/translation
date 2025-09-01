 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; if ( n == 1 ) { System.out.println ( 0 ) ; return ; } int [ ] arr = new int [ 100 ] ; int cnt = 0 ; while ( n > 1 ) { if ( n % 2 == 0 ) { arr [ cnt ++ ] = 2 ; n = n / 2 ; } else { int f = 3 ; while ( f * f <= n ) { if ( n % f == 0 ) { arr [ cnt ++ ] = f ; n = n / f ; } else { f += 2 ; } } if ( n != 1 ) { arr [ cnt ++ ] = n ; n = 1 ; } } } int ans = 0 ; for ( int i = 0 ; i < cnt ; i ++ ) { int x = 0 ; for ( int j = 1 ; j <= 99999999 ; j ++ ) { if ( x + j <= arr [ i ] ) { x += j ; ans ++ ; } else { break ; } } } System.out.println ( ans ) ; } } }

```
