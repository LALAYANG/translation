 [INST:perfect]
```
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '1' ) count ++ ; } int ans = count ; for ( int i = 0 ; i < n ; i ++ ) { if ( s.charAt ( i ) == '0' ) { int j = i + 1 ; while ( j < n && s.charAt ( j ) == '0' ) j ++ ; int k = j ; while ( k < n && s.charAt ( k ) == '1' ) k ++ ; int l = k ; while ( l < n && s.charAt ( l ) == '0' ) l ++ ; if ( l - i > ans ) ans = l - i ; i = l ; } } System.out.println ( ans ) ; } }

```
