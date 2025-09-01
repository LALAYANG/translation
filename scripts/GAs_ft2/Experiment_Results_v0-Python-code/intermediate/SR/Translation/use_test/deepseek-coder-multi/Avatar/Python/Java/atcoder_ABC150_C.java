```

```

```java
import java.util.* ; import java.io.* ; public class codeforces_514_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] p = new int [ n ] ; int [ ] q = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { p [ i ] = sc.nextInt ( ) ; } for ( int i = 0 ; i < n ; i ++ ) { q [ i ] = sc.nextInt ( ) ; } int p_index = 0 ; int q_index = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( p [ i ] != q [ i ] ) { p_index = i ; q_index = i ; break ; } } int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( p [ i ] != q [ i ] ) { count ++ ; } } System.out.println ( Math.abs ( p_index - q_index ) + count ) ; } }

```
