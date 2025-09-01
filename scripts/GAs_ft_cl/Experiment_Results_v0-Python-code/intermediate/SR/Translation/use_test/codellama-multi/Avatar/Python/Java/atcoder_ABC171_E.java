 [INST:py]
import sys

def calculate_xor(a, b):
    return a ^ b

count = int(input())
numbers = list(map(int, input().split()))
xor_sum = 0

for i in range(count):
    xor_sum = xor_sum ^ numbers[i]

print(' '.join(list(map(lambda x: str(calculate_xor(x, xor_sum)), numbers))))
```
[/INST]  
 [INST:java]
import java.util.Scanner ; public class atcoder_ABC171_A { public static void main ( String [ ] args ) { Scanner sc = new Scanner ( System.in ) ; int n = sc.nextInt ( ) ; int [ ] arr = new int [ n ] ; for ( int i = 0 ; i < n ; i ++ ) { arr [ i ] = sc.nextInt ( ) ; } int xor = 0 ; for ( int i = 0 ; i < n ; i ++ ) { xor ^= arr [ i ] ; } for ( int i = 0 ; i < n ; i ++ ) { System.out.print ( ( xor ^ arr [ i ] ) + " " ) ; } } }

```
