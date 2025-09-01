 ```java
import java.util.Scanner ; public class codeforces_541_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int total = 0 ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < n ; i ++ ) { int a = sc.nextInt ( ) ; int g = sc.nextInt ( ) ; if ( total + a <= 500 ) { total += a ; sb.append ( "A" ) ; } else { total -= g ; sb.append ( "G" ) ; } } System.out.println ( sb.toString ( ) ) ; } }

```
