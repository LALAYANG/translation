 [INST:perfect]
```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; int [ ] x = new int [ N ] ; int [ ] y = new int [ N ] ; for ( int i = 0 ; i < N ; i ++ ) { x [ i ] = sc.nextInt ( ) ; y [ i ] = sc.nextInt ( ) ; } double ans = 0 ; for ( int i = 0 ; i < N ; i ++ ) { for ( int j = i + 1 ; j < N ; j ++ ) { double dx = x [ j ] - x [ i ] ; double dy = y [ j ] - y [ i ] ; double distance = Math.sqrt ( dx * dx + dy * dy ) ; ans += distance ; } } System.out.println ( ans / ( N * ( N - 1 ) ) ) ; } }

```
