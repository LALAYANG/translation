 ```java
import java.util.Scanner ; public class atcoder_ABC167_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String s = sc.nextLine ( ) ; int a = 0 , b = 0 ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { char c = s.charAt ( i ) ; if ( c >= 'a' && c <= 'z' ) { a ++ ; } else { b ++ ; } } if ( a > b ) { System.out.println ( s.toUpperCase ( ) ) ; } else { System.out.println ( s.toLowerCase ( ) ) ; } } }

```
