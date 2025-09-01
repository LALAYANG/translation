 ```java
import java.util.Scanner ; public class atcoder_ABC148_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; String T = sc.next ( ) ; int [ ] countS = new int [ 26 ] ; int [ ] countT = new int [ 26 ] ; for ( int i = 0 ; i < S.length ( ) ; i ++ ) { countS [ S.charAt ( i ) - 'a' ] ++ ; } for ( int i = 0 ; i < T.length ( ) ; i ++ ) { countT [ T.charAt ( i ) - 'a' ] ++ ; } int ans = 0 ; for ( int i = 0 ; i < 26 ; i ++ ) { ans += Math.min ( countS [ i ] , countT [ i ] ) ; } System.out.println ( ans ) ; } }

```
