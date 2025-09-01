 ```java
import java.util.Scanner ; public class codeforces_63_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int r = 0 ; int g = 0 ; int b = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == 'R' ) r ++ ; else if ( s.charAt ( i ) == 'G' ) g ++ ; else b ++ ; } int ans = r * g * b ; for ( int i = 1 ; i <= n / 2 ; i ++ ) { for ( int j = 0 ; j + 2 * i <= n ; j ++ ) { String str = "" ; for ( int k = 0 ; k < 3 ; k ++ ) { str += s.charAt ( j + i * k ) ; } if ( str.equals ( "RGB" ) || str.equals ( "RBG" ) || str.equals ( "BGR" ) || str.equals ( "BRG" ) || str.equals ( "GBR" ) || str.equals ( "GRB" ) ) ans -- ; } } System.out.println ( ans ) ; } }

```
