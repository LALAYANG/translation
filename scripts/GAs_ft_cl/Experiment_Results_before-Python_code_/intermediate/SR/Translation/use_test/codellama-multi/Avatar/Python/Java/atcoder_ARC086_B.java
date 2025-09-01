 [INST:perfect]
```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] A = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { A [ i ] = sc.nextInt ( ) ; } int max = 0 ; int maxIndex = - 1 ; for ( int i = 0 ; i < N ; i ++ ) { if ( Math.abs ( A [ i ] ) > max ) { max = Math.abs ( A [ i ] ) ; maxIndex = i ; } } if ( A [ maxIndex ] > 0 ) { System.out.println ( 2 * N - 1 ) ; for ( int i = 0 ; i < N ; i ++ ) { if ( i < maxIndex ) { System.out.println ( maxIndex + 1 + " " + ( i + 1 ) ) ; } else { System.out.println ( i + 1 + " " + ( i + 2 ) ) ; } } } else { System.out.println ( 0 ) ; } } }

```
