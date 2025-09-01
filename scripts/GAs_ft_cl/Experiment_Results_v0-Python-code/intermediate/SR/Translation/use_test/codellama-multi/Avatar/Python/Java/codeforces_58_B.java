 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int res = n ; while ( res > 1 ) { for ( int i = res ; i > 0 ; i -- ) { if ( n % i == 0 ) { res = i ; break ; } } } System.out.println ( res + " " + ( n / res ) ) ; } }

```
