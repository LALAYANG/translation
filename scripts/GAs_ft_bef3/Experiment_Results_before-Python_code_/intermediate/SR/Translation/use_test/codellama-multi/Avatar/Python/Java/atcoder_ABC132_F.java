 ```java
import java.util.Scanner ; public class codeforces_383_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) , k = sc.nextInt ( ) ; int [ ] coef = new int [ ( int ) ( Math.sqrt ( n ) + 1 ) ] , dp = new int [ k + 1 ] [ ( int ) ( Math.sqrt ( n ) + 1 ) ] ; for ( int i = 1 ; i <= coef.length ; i ++ ) coef [ i - 1 ] = n / i - n / ( i + 1 ) ; for ( int i = 1 ; i <= coef.length ; i ++ ) coef [ coef.length - i ] = coef [ coef.length - i - 1 ] ; for ( int i = 1 ; i <= k ; i ++ ) { for ( int j = 1 ; j <= coef.length ; j ++ ) { dp [ i ] [ j ] = coef [ j - 1 ] * dp [ i - 1 ] [ coef.length - j ] ; } } System.out.println ( dp [ k ] [ coef.length ] ) ; } }

```
