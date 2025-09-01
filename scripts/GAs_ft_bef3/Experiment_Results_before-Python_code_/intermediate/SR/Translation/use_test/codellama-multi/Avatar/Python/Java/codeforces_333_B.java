 ```java
import java.util.Scanner ; public class codeforces_693_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int [ ] arr = new int [ a * 2 ] ; for ( int i = 0 ; i < a * 2 ; i ++ ) { arr [ i ] = 1 ; } arr [ 0 ] = 0 ; arr [ a - 1 ] = 0 ; arr [ a ] = 0 ; arr [ a + a - 1 ] = 0 ; for ( int i = 0 ; i < b ; i ++ ) { int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; arr [ x - 1 ] = 0 ; arr [ a + y - 1 ] = 0 ; } if ( a % 2 == 0 ) { if ( arr [ a / 2 ] == 1 && arr [ a + a / 2 ] == 1 ) { arr [ a / 2 ] = 0 ; } } System.out.println ( sum ( arr ) ) ; } public static int sum ( int [ ] arr ) { int sum = 0 ; for ( int i = 0 ; i < arr.length ; i ++ ) { sum += arr [ i ] ; } return sum ; } }

```
