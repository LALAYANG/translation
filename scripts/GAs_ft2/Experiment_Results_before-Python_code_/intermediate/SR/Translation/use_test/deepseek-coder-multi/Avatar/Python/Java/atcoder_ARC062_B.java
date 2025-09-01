```
import java.util.* ; public class codeforces_231_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int k = sc.nextInt ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { int a = sc.nextInt ( ) ; if ( a == 1 && k > 0 ) { k -- ; count ++ ; } else if ( a == 1 && k <= 0 ) { count -- ; } else if ( a == 0 ) { count ++ ; } } System.out.println ( count ) ; } }

```
