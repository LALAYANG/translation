 ```java
import java.util.Scanner ; public class atcoder_ABC174_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int M = sc.nextInt ( ) ; String S = sc.next ( ) ; String T = sc.next ( ) ; int [ ] S_arr = new int [ N ] ; int [ ] T_arr = new int [ M ] ; for ( int i = 0 ; i < N ; i ++ ) { S_arr [ i ] = S.charAt ( i ) - '0' ; } for ( int i = 0 ; i < M ; i ++ ) { T_arr [ i ] = T.charAt ( i ) - '0' ; } int ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = 0 ; j < M ; j ++ ) { if ( S_arr [ i ] != T_arr [ j ] ) { ans = - 1 ; break ; } } if ( ans == - 1 ) { break ; } } System.out.println ( ans ) ; } }

```
