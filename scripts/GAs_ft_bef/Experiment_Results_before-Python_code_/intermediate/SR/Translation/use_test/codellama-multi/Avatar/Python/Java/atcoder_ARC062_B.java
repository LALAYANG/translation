 ```java
import java.util.Scanner ; public class codeforces_571_A { public static void main ( String [ ] args ) { Scanner scan = new Scanner ( System.in ) ; int n = scan.nextInt ( ) ; int m = scan.nextInt ( ) ; int score = 0 ; int g = 0 ; int p = 0 ; for ( int i = 0 ; i < n ; i ++ ) { char c = scan.next ( ).charAt ( 0 ) ; if ( c == 'g' ) { if ( g > p ) { score ++ ; p ++ ; } else if ( g < p ) { score -- ; g ++ ; } } else { if ( g > p ) { score -- ; g ++ ; } else if ( g < p ) { score ++ ; p ++ ; } } } System.out.println ( score ) ; } }

```
