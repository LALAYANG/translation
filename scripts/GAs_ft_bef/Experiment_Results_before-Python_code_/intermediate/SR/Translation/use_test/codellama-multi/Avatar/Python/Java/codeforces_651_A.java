 ```java
import java.util.Scanner ; public class atcoder_ABC177_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int sum = x + y ; int diff = y - x ; if ( diff >= 3 ) { sum += diff / 3 ; } if ( sum > 0 ) { System.out.println ( sum ) ; } else { System.out.println ( 0 ) ; } } }

```
