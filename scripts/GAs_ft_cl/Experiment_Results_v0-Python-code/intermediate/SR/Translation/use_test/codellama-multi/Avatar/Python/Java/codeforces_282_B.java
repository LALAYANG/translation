 ```java
import java.util.Scanner ; public class atcoder_ABC158_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int total = 0 ; String ans = "" ; for ( int i = 0 ; i < N ; i ++ ) { int A = sc.nextInt ( ) ; int G = sc.nextInt ( ) ; if ( total + A <= 500 ) { total += A ; ans += "A" ; } else { total -= G ; ans += "G" ; } } System.out.println ( ans ) ; } }

```
