 ```java
import java.util.Scanner ; public class codeforces_240_A { public static void main ( String [ ] args ) { Scanner in = new Scanner ( System.in ) ; int a , b , c , d , e , f ; a = in.nextInt ( ) ; b = in.nextInt ( ) ; c = in.nextInt ( ) ; d = in.nextInt ( ) ; e = in.nextInt ( ) ; f = in.nextInt ( ) ; int [ ] arr = new int [ 6 ] ; arr [ 0 ] = a ; arr [ 1 ] = b ; arr [ 2 ] = c ; arr [ 3 ] = d ; arr [ 4 ] = e ; arr [ 5 ] = f ; int sum = 0 ; for ( int i = 1 ; i < arr.length ; i ++ ) { int x = arr [ i ] ; if ( x % 10 == 0 ) { sum += x ; } else { sum += x + 10 - x % 10 ; } } System.out.println ( sum ) ; } }

```
