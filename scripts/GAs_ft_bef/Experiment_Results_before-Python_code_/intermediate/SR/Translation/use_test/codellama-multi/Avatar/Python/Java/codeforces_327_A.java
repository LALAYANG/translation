 ```java
import java.util.Scanner ; public class atcoder_ABC161_D { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '1' ) count ++ ; } int result = count ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '0' ) { int start = i ; while ( s.charAt ( i ) == '0' ) i ++ ; int end = i ; int length = end - start ; result += 2 * length - 1 ; } } System.out.println ( result ) ; } }

```
