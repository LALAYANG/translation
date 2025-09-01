```java
import java.util.* ; public class codeforces_266_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; char [ ] [ ] cake = new char [ n ] [ ] ; for ( int i = 0 ; i < n ; i ++ ) { cake [ i ] = sc.next ( ).toCharArray ( ) ; } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { for ( int j = 0 ; j < n ; j ++ ) { if ( cake [ i ] [ j ] == 'C' ) { count ++ ; } } if ( count > 1 ) { count = count * ( count - 1 ) / 2 ; } else { count = 0 ; } } for ( int i = 0 ; i < n ; i ++ ) { count = 0 ; for ( int j = 0 ; j < n ; j ++ ) { if ( cake [ j ] [ i ] == 'C' ) { count ++ ; } } if ( count > 1 ) { count = count * ( count - 1 ) / 2 ; } else { count = 0 ; } } System.out.println ( count ) ; } }

```
