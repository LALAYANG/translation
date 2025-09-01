 ```java
import java.util.Scanner ; public class atcoder_ABC172_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int length = a ; int [ ] arr = new int [ 3 ] ; arr [ 0 ] = b ; arr [ 1 ] = c ; arr [ 2 ] = d ; int max = 0 ; if ( length % arr [ 0 ] == 0 ) { System.out.println ( length / arr [ 0 ] ) ; return ; } for ( int i = 0 ; i <= length / arr [ 2 ] ; i ++ ) { for ( int j = 0 ; j <= length / arr [ 1 ] ; j ++ ) { int check = length - i * arr [ 2 ] - j * arr [ 1 ] ; if ( check >= 0 && check % arr [ 0 ] == 0 ) { int k = check / arr [ 0 ] ; max = Math.max ( max , k + i + j ) ; } } } System.out.println ( max ) ; } }

```
