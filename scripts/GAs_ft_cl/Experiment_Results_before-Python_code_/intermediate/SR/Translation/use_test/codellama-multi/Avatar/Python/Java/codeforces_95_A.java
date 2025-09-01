 ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; String [ ] arr = new String [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.next ( ) ; } String s = sc.next ( ) ; char c = sc.next ( ).charAt ( 0 ) ; StringBuilder sb = new StringBuilder ( s ) ; for ( int i = 0 ; i < s.length ( ) ; i ++ ) { if ( s.charAt ( i ) == c ) { sb.setCharAt ( i , c ) ; } else if ( s.charAt ( i ) == Character.toLowerCase ( c ) ) { sb.setCharAt ( i , Character.toUpperCase ( c ) ) ; } } System.out.println ( sb.toString ( ) ) ; } }

```
