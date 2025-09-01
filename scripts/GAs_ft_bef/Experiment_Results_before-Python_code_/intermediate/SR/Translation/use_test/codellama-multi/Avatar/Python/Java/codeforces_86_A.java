 ```java
import java.util.Scanner ; public class atcoder_ABC171_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int ans = - 1 ; for ( int i = a ; i <= b ; i ++ ) { String s = String.valueOf ( i ) ; int rev = 0 ; for ( int j = s.length ( ) - 1 ; j >= 0 ; j -- ) { rev = rev * 10 + ( 9 - ( s.charAt ( j ) - '0' ) ) ; } ans = Math.max ( ans , rev * i ) ; } System.out.println ( ans ) ; } }

```
