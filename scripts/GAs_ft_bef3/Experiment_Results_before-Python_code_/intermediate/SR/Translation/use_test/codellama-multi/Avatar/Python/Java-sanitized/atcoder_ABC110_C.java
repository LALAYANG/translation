[java]
import java.util.* ; public class atcoder_ABC110_C { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; String S = sc.next ( ) ; String T = sc.next ( ) ; if ( S.length ( ) != T.length ( ) ) { System.out.println ( "No" ) ; } else { char [ ] arr1 = S.toCharArray ( ) ; Arrays.sort ( arr1 ) ; char [ ] arr2 = T.toCharArray ( ) ; Arrays.sort ( arr2 ) ; if ( Arrays.equals ( arr1 , arr2 ) ) { System.out.println ( "Yes" ) ; } else { System.out.println ( "No" ) ; } } } }

 [/java]