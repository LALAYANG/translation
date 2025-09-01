 ```java
import java.util.Scanner ; public class atcoder_ABC171_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int m = sc.nextInt ( ) ; String s = sc.next ( ) ; int sa = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '-' ) sa ++ ; } sa = Math.min ( sa , n - sa ) ; StringBuilder sb = new StringBuilder ( ) ; for ( int i = 0 ; i < m ; i ++ ) { int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; b = b - a ; sb.append ( ( b % 2 == 0 && b <= sa * 2 ) ? "1\n" : "0\n" ) ; } System.out.println ( sb ) ; } }

```
