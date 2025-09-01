 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; sc.nextLine ( ) ; String s = sc.nextLine ( ) ; int ans = 1 ; int sumL = 0 ; for ( String sentence : s.split ( "[.?!]" ) ) { sentence = sentence.trim ( ) + "." ; int L = sentence.length ( ) ; if ( L > 1 ) { if ( L > n ) { System.out.println ( "Impossible" ) ; return ; } if ( sumL + L + ( sumL > 0 ) > n ) { ans ++ ; sumL = L ; } else { sumL += L + ( sumL > 0 ) ; } } } System.out.println ( ans ) ; } }

```
