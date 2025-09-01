 ```java
import java.io.BufferedReader ; import java.io.IOException ; import java.io.InputStreamReader ; import java.util.StringTokenizer ; public class atcoder_ABC151_A { public static void main ( String [ ] args ) throws IOException { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; StringTokenizer st = new StringTokenizer ( br.readLine ( ) ) ; int N = Integer.parseInt ( st.nextToken ( ) ) ; int [ ] arr = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { arr [ i ] = Integer.parseInt ( st.nextToken ( ) ) ; } int XOR = 0 ; for ( int i = 0 ; i < N ; i ++ ) { XOR ^= arr [ i ] ; } for ( int i = 0 ; i < N ; i ++ ) { System.out.print ( arr [ i ] ^ XOR + " " ) ; } } }

```
