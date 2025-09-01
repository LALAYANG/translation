 ```java
import java.util.Scanner ; public class atcoder_ABC154_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int s = sc.nextInt ( ) ; int l = 2019 ; int [ ] m = new int [ l ] ; m [ 0 ] = 1 ; int a = 0 ; int r = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { a += Integer.parseInt ( String.valueOf ( s.charAt ( s.length ( ) - i - 1 ) ) ) * ( int ) Math.pow ( 10 , i ) ; r += m [ a % l ] ; m [ a % l ] ++ ; } System.out.println ( r ) ; } }

```
