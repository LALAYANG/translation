 [CODE]
import java.util.Scanner ; public class atcoder_ABC104_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; for ( int i = 1 ; i <= 12 ; i ++ ) { if ( 12 % i == 0 ) { int x = 12 / i ; int found = 0 ; for ( int j = 0 ; j < s.length ( ) ; j ++ ) { if ( s.charAt ( j ) == 'O' ) { found ++ ; } if ( found == x ) { count ++ ; break ; } } } } System.out.println ( count + " " ) ; for ( int i = 1 ; i <= 12 ; i ++ ) { if ( 12 % i == 0 ) { int x = 12 / i ; int found = 0 ; for ( int j = 0 ; j < s.length ( ) ; j ++ ) { if ( s.charAt ( j ) == 'O' ) { found ++ ; } if ( found == x ) { System.out.print ( x + "x" + i + " " ) ; break ; } } } } System.out.println ( ) ; } } }

```
