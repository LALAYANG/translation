```java
import java.util.* ; public class codeforces_265_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String [ ] s = new String [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { s [ i ] = sc.next ( ) ; } String str = sc.next ( ) ; char c = sc.next ( ).charAt ( 0 ) ; char c1 = ( c == 'a' ) ? 'b' : 'a' ; char [ ] arr = str.toCharArray ( ) ; for ( int i = 0 ; i < str.length ( ) ; i ++ ) { if ( arr [ i ] == c || arr [ i ] == c - 32 ) { arr [ i ] = c1 ; } } System.out.println ( arr ) ; } }

```
