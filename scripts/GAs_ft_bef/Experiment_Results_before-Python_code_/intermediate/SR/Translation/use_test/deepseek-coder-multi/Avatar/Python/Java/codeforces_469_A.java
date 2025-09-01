```java
import java.util.* ; import java.io.* ; public class codeforces_231_A { public static void main ( String [ ] args ) throws IOException { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; int n = Integer.parseInt ( br.readLine ( ) ) ; StringTokenizer st = new StringTokenizer ( br.readLine ( ) ) ; HashSet < Integer > hs = new HashSet < > ( ) ; while ( st.hasMoreTokens ( ) ) { hs.add ( Integer.parseInt ( st.nextToken ( ) ) ) ; } st = new StringTokenizer ( br.readLine ( ) ) ; while ( st.hasMoreTokens ( ) ) { hs.add ( Integer.parseInt ( st.nextToken ( ) ) ) ; } if ( hs.size ( ) == n ) System.out.println ( "I become the guy." ) ; else System.out.println ( "Oh, my keyboard!" ) ; } }

```
