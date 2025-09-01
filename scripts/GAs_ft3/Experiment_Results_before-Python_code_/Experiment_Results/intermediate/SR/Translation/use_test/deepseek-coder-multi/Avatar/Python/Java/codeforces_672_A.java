```java
import java.util.* ; import java.io.* ; public class codeforces_514_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; ArrayList < Integer > arr = new ArrayList < > ( ) ; for ( int i = 1 ; i <= 370 ; i ++ ) { int x = i ; while ( x > 0 ) { arr.add ( x % 10 ) ; x /= 10 ; } } arr.remove ( 0 ) ; arr.remove ( 0 ) ; System.out.println ( arr.get ( n - 1 ) ) ; } }

```
