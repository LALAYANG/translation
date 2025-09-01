 ```java
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String s = sc.next ( ) ; int count = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '1' ) { count ++ ; } } if ( count == 0 ) { System.out.println ( 0 ) ; } else { int sum = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == '0' ) { sum ++ ; } else if ( s.charAt ( i ) == '1' ) { sum = sum * 2 + 1 ; } } System.out.println ( sum ) ; } } }

```
