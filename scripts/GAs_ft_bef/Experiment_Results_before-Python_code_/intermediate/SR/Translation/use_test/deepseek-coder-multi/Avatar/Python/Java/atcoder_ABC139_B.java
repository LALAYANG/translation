```java
import java.util.* ; public class codeforces_58_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int hole = 1 , i = 0 , check = true ; while ( check ) { if ( hole >= b ) { check = false ; } else { hole = a * ( i + 1 ) - i ; i ++ ; } } System.out.println ( i ) ; } }

```
