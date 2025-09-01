 ```java
import java.util.Scanner ; public class atcoder_ABC148_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int a = sc.nextInt ( ) ; int b = sc.nextInt ( ) ; int x = Math.max ( String.valueOf ( a ).length ( ) , String.valueOf ( b ).length ( ) ) ; StringBuffer sb = new StringBuffer ( ) ; int carry = 0 ; for ( int i = 0 ; i < x ; i ++ ) { int sum = carry + ( a % 10 ) + ( b % 10 ) ; sb.append ( sum % 10 ) ; carry = sum / 10 ; a /= 10 ; b /= 10 ; } if ( carry == 1 ) { sb.append ( 1 ) ; } System.out.println ( Integer.parseInt ( sb.reverse ( ).toString ( ) ) ) ; } }

```
