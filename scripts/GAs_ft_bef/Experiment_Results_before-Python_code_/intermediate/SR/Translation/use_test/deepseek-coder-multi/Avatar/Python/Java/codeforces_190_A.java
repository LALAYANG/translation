```java
import java.util.Scanner ; import java.util.Arrays ; public class codeforces_466_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; if ( n == 0 && m == 0 ) { System.out.println ( "0 0" ) ; return ; } if ( n == 0 ) { System.out.println ( m + " " + m ) ; return ; } if ( m == 0 ) { System.out.println ( n + " " + n ) ; return ; } if ( n <= m ) { System.out.println ( m + " " + ( m + n - 1 ) ) ; } else { System.out.println ( n + " " + ( n + m - 1 ) ) ; } } }

```
