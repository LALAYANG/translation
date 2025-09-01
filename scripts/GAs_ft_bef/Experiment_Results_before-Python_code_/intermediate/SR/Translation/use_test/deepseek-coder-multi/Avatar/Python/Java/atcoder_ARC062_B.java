```java
import java.util.* ; import java.io.* ; public class codeforces_231_A { public static void main ( String [ ] args ) throws IOException { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; PrintWriter pw = new PrintWriter ( System.out ) ; int n = Integer.parseInt ( br.readLine ( ) ) ; int ans = 0 ; int g = 0 ; int p = 0 ; for ( int i = 0 ; i < n ; i ++ ) { String s = br.readLine ( ) ; if ( s.equals ( "g" ) ) g ++ ; else if ( s.equals ( "p" ) ) { p ++ ; if ( g > p ) ans ++ ; } } pw.println ( ans ) ; pw.close ( ) ; } }

```
