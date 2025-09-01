 ```java
import java.util.Scanner ; public class atcoder_ABC146_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; char [ ] vowels = { 'a' , 'e' , 'i' , 'o' , 'u' , 'y' , 'A' , 'E' , 'I' , 'O' , 'U' , 'Y' } ; for ( int i = S.length ( ) - 1 ; i >= 0 ; i -- ) { if ( S.charAt ( i ) == ' ' || S.charAt ( i ) == '?' ) { continue ; } else { if ( vowels.length > 0 && vowels [ 0 ] == S.charAt ( i ) ) { System.out.println ( "YES" ) ; break ; } else { System.out.println ( "NO" ) ; break ; } } } } }

```
