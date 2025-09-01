```java
import java.util.* ; import java.io.* ; import java.nio.charset.* ; import java.nio.file.* ; import java.nio.file.attribute.* ; import java.util.function.* ; import java.util.stream.* ; public class codeforces_616_B { public static void main ( String [ ] args ) throws IOException { Scanner in = new Scanner ( System.in ) ; String s = in.next ( ) ; int l = 2019 ; int [ ] m = new int [ l ] ; int a = 0 , r = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { a += Integer.parseInt ( String.valueOf ( s.charAt ( i ) ) ) * ( int ) Math.pow ( 10 , i ) % l ; r += m [ a % l ] ; m [ a % l ] ++ ; } System.out.println ( r ) ; } }

```
