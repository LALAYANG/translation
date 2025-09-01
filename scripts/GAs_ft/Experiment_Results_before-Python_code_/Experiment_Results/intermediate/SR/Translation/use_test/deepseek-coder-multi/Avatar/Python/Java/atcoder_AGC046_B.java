```java
import java.util.* ; public class atcoder_ABC152_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int A = sc.nextInt ( ) ; int B = sc.nextInt ( ) ; int C = sc.nextInt ( ) ; int D = sc.nextInt ( ) ; long [ ] [ ] dp = new long [ C + 1 ] [ D + 1 ] ; dp [ A ] [ B ] = 1 ; for ( int i = A ; i <= C ; i ++ ) { for ( int j = B ; j <= D ; j ++ ) { dp [ i ] [ j ] += ( dp [ i ] [ j - 1 ] * i + dp [ i - 1 ] [ j ] * j - dp [ i - 1 ] [ j - 1 ] * ( i - 1 ) * ( j - 1 ) ) % 998244353 ; } } System.out.println ( dp [ C ] [ D ] ) ; } }

```
