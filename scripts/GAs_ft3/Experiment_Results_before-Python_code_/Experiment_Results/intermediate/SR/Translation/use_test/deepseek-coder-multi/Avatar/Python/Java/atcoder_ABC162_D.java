```java
import java.util.* ; import java.io.* ; public class atcoder_ABC129_B { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int N = sc.nextInt ( ) ; String S = sc.next ( ) ; int rNum = 0 ; int gNum = 0 ; int bNum = 0 ; for ( int i = 0 ; i < N ; i ++ ) { if ( S.charAt ( i ) == 'R' ) rNum ++ ; else if ( S.charAt ( i ) == 'G' ) gNum ++ ; else bNum ++ ; } int sum = 0 ; for ( int i = 0 ; i < N - 2 ; i ++ ) { for ( int j = i + 1 ; j < N - 1 ; j ++ ) { for ( int k = j + 1 ; k < N ; k ++ ) { if ( S.charAt ( i ) != S.charAt ( j ) && S.charAt ( j ) != S.charAt ( k ) && S.charAt ( k ) != S.charAt ( i ) ) sum ++ ; } } } System.out.println ( rNum * gNum * bNum - sum ) ; } }

```
