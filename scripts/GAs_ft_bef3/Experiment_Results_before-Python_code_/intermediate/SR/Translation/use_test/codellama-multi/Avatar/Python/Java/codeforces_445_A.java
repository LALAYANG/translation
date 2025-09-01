 ```java
import java.util.* ; public class codeforces_567_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; char [ ] arr = new char [ m ] ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < n ; i ++ ) { arr = sc.next ( ).toCharArray ( ) ; for ( int j = 0 ; j < m ; j ++ ) { if ( arr [ j ] == '.' ) { if ( ( i + j ) % 2 == 0 ) arr [ j ] = 'B' ; else arr [ j ] = 'W' ; } } sb.append ( arr ).append ( "\n" ) ; } System.out.println ( sb ) ; } }

```
