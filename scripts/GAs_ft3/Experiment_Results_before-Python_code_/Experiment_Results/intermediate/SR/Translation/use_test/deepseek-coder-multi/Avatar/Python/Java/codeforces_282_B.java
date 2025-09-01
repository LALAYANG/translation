```java
import java.util.* ; public class codeforces_268_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int a = 0 , g = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; if ( a + x <= 500 ) { a += x ; } else { g += y ; } } StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < n ; i ++ ) { if ( a > g ) { sb.append ( "A" ) ; a -= x ; } else { sb.append ( "G" ) ; g -= y ; } } System.out.println ( sb ) ; } }

```
