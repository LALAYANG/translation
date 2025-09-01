 ```java
import java.util.Scanner ; public class codeforces_247_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { System.out.println ( func ( arr [ i ] , arr [ i ] - 1 ) ) ; } } public static int func ( int a , int b ) { if ( a > b ) { int total = 0 ; while ( a > 0 && b > 0 ) { total += a / b ; a = a % b ; if ( a > 0 ) { total += b / a ; b = b % a ; } } return total ; } if ( a < b ) { int total = 0 ; while ( a > 0 && b > 0 ) { total += b / a ; b = b % a ; if ( b > 0 ) { total += a / b ; a = a % b ; } } return total ; } return 1 ; } }

```
