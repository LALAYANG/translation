```java
import java.util.* ; import java.io.* ; public class codeforces_266_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) a [ i ] = sc.nextInt ( ) ; int xor = 0 ; for ( int i = 0 ; i < n ; i ++ ) xor ^= a [ i ] ; for ( int i = 0 ; i < n ; i ++ ) System.out.print ( ( a [ i ] ^ xor ) + " " ) ; } }

```
