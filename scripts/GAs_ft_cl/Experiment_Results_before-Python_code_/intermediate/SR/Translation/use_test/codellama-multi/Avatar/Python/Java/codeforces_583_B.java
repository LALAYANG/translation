 [INST:perfect! I'm glad you liked it. Here's the Java code for the problem:
```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int currentLevel = 0 ; int counter = 0 ; int counterTurns = - 1 ; while ( counter < n ) { counterTurns ++ ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] != - 1 && a [ i ] <= counter ) { counter ++ ; a [ i ] = - 1 ; } } a = reverse ( a ) ; } System.out.println ( counterTurns ) ; } public static int [ ] reverse ( int [ ] a ) { int n = a.length ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ n - i - 1 ] ; } return b ; } }

```
[/INST]  [INST:```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int currentLevel = 0 ; int counter = 0 ; int counterTurns = - 1 ; while ( counter < n ) { counterTurns ++ ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] != - 1 && a [ i ] <= counter ) { counter ++ ; a [ i ] = - 1 ; } } a = reverse ( a ) ; } System.out.println ( counterTurns ) ; } public static int [ ] reverse ( int [ ] a ) { int n = a.length ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ n - i - 1 ] ; } return b ; } }

```
[/INST]  [INST:  ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int currentLevel = 0 ; int counter = 0 ; int counterTurns = - 1 ; while ( counter < n ) { counterTurns ++ ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] != - 1 && a [ i ] <= counter ) { counter ++ ; a [ i ] = - 1 ; } } a = reverse ( a ) ; } System.out.println ( counterTurns ) ; } public static int [ ] reverse ( int [ ] a ) { int n = a.length ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ n - i - 1 ] ; } return b ; } }

```
[/INST]  [INST:  ```java
import java.util.Scanner ; public class codeforces_59_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] a = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { a [ i ] = sc.nextInt ( ) ; } int currentLevel = 0 ; int counter = 0 ; int counterTurns = - 1 ; while ( counter < n ) { counterTurns ++ ; for ( int i = 0 ; i < n ; i ++ ) { if ( a [ i ] != - 1 && a [ i ] <= counter ) { counter ++ ; a [ i ] = - 1 ; } } a = reverse ( a ) ; } System.out.println ( counterTurns ) ; } public static int [ ] reverse ( int [ ] a ) { int n = a.length ; int [ ] b = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { b [ i ] = a [ n - i - 1 ] ; } return b ; } }

```
[/INST]
