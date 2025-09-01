```java
import java.util.* ; public class codeforces_265_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int c = sc.nextInt ( ) ; int d = sc.nextInt ( ) ; int ans = 0 ; if ( a == b && b == c ) { ans = d / a ; } else if ( a == b ) { int k = 0 ; for ( int i = 0 ; i <= d / c ; i ++ ) { int rem = d - i * c ; if ( rem % a == 0 ) { k = Math.max ( k , i + rem / a ) ; } } ans = k ; } else { int k = 0 ; for ( int i = 0 ; i <= d / c ; i ++ ) { for ( int j = 0 ; j <= d / b ; j ++ ) { int rem = d - i * c - j * b ; if ( rem >= 0 && rem % a == 0 ) { k = Math.max ( k , i + j + rem / a ) ; } } } ans = k ; } System.out.println ( ans ) ; } }

```
