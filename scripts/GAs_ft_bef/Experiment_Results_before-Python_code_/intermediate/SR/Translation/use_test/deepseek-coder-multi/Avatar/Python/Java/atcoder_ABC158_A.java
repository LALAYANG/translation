```java
import java.io.BufferedReader ; import java.io.IOException ; import java.io.InputStreamReader ; import java.io.PrintWriter ; public class atcoder_ABC145_A { public static void main ( String [ ] args ) throws IOException { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; PrintWriter pw = new PrintWriter ( System.out ) ; String str = br.readLine ( ) ; String result = "Yes" ; if ( ! str.contains ( "A" ) || ! str.contains ( "B" ) ) { result = "No" ; } pw.println ( result ) ; pw.flush ( ) ; } }

```
