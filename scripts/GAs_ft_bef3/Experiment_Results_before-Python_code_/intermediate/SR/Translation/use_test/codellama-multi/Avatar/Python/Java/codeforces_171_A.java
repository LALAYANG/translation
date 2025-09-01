 [INST:py]  
import sys
input = sys.stdin.readline
a , b = input ( ) [ : - 1 ].split ( )
x = max ( len ( a ) , len ( b ) )
a = a.rjust ( x , '0' )
b = b.ljust ( x , '0' )
s = ''
c = 0
for i in range ( x ) :
    d = int ( b [ i ] ) + int ( a [ x - i - 1 ] ) + c
    if d > 9 :
        s += str ( d ) [ 1 ]
        c = 1
    else :
        s += str ( d )
        c = 0
if c == 1 :
    s += '1'
print ( int ( s [ : : - 1 ] ) )
[/INST]  ```java
import java.io.BufferedReader ; import java.io.IOException ; import java.io.InputStreamReader ; public class atcoder_ABC134_A { public static void main ( String [ ] args ) throws IOException { BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) ) ; String [ ] str = br.readLine ( ).split ( "" ) ; int x = Math.max ( str [ 0 ].length ( ) , str [ 1 ].length ( ) ) ; StringBuilder sb = new StringBuilder ( ) ; int c = 0 ; for ( int i = 0 ; i < x ; i ++ ) { int d = Integer.parseInt ( str [ 1 ].substring ( i , i + 1 ) ) + Integer.parseInt ( str [ 0 ].substring ( x - i - 1 , x - i - 1 ) ) + c ; if ( d > 9 ) { sb.append ( d - 10 ) ; c = 1 ; } else { sb.append ( d ) ; c = 0 ; } } if ( c == 1 ) { sb.append ( 1 ) ; } sb = sb.reverse ( ) ; System.out.println ( Integer.parseInt ( sb.toString ( ) ) ) ; } }

```
