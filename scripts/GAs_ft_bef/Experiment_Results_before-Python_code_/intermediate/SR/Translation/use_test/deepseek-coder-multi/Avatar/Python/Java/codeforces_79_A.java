```java
import java.util.* ; public class atcoder_ABC144_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int x = sc.nextInt ( ) ; int y = sc.nextInt ( ) ; int a = 0 ; while ( x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2 ) { if ( a == 0 ) { if ( x >= 2 && y >= 2 ) { x -= 2 ; y -= 2 ; } else if ( x >= 1 && y >= 12 ) { x -= 1 ; y -= 12 ; } else { y -= 22 ; } a = 1 ; } else { if ( y >= 22 ) { y -= 22 ; } else if ( x >= 1 && y >= 12 ) { x -= 1 ; y -= 12 ; } else { x -= 2 ; y -= 2 ; } a = 0 ; } } System.out.println ( a == 0 ? "Hanako" : "Ciel" ) ; } }

```
