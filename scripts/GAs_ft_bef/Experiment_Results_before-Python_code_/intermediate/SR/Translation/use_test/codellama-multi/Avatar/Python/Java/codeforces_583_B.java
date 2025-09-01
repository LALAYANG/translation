 ```java
import java.util.Scanner ; public class codeforces_224_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int counter = 0 ; int turns = 0 ; while ( counter < n ) { turns ++ ; for ( int i = 0 ; i < n ; i ++ ) { if ( arr [ i ] != - 1 && arr [ i ] <= counter ) { counter ++ ; arr [ i ] = - 1 ; } } arr = reverse ( arr ) ; } System.out.println ( turns ) ; } static int [ ] reverse ( int [ ] arr ) { int n = arr.length ; int temp ; for ( int i = 0 ; i < n / 2 ; i ++ ) { temp = arr [ i ] ; arr [ i ] = arr [ n - i - 1 ] ; arr [ n - i - 1 ] = temp ; } return arr ; } }

```
