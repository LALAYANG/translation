 ```java
import java.util.Scanner ; public class atcoder_ABC179_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; String o = sc.next ( ) ; int ans = Math.min ( Math.min ( a + b , a * b ) , Math.min ( b + c , b * c ) ) ; if ( o.equals ( "+" ) ) { ans = Math.min ( ans , a + c ) ; } else { ans = Math.min ( ans , a * c ) ; } System.out.println ( ans ) ; } }

```
