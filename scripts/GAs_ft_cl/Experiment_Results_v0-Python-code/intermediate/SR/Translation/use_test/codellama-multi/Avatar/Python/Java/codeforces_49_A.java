 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; boolean flag = false ; for ( int i = S.length ( ) - 1 ; i >= 0 ; i -- ) { if ( S.charAt ( i ) == ' ' || S.charAt ( i ) == '?' ) continue ; if ( S.charAt ( i ) == 'a' || S.charAt ( i ) == 'e' || S.charAt ( i ) == 'i' || S.charAt ( i ) == 'o' || S.charAt ( i ) == 'u' || S.charAt ( i ) == 'y' || S.charAt ( i ) == 'A' || S.charAt ( i ) == 'E' || S.charAt ( i ) == 'I' || S.charAt ( i ) == 'O' || S.charAt ( i ) == 'U' || S.charAt ( i ) == 'Y' ) { flag = true ; break ; } } if ( flag ) System.out.println ( "YES" ) ; else System.out.println ( "NO" ) ; } }

```
