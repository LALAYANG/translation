<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 2
1 1

Expected output:
YES


```
import sys
n , t = map ( int , input ( ).split ( ) )
s = list ( [ int ( x ) for x in input ( ).split ( ) ] )
current_cell = 0
while current_cell <= t :
    current_cell += s [ current_cell - 1 ]
    if current_cell == t :
        print ( "YES" )
        sys.exit ( )
    else :
        continue
print ( "NO" )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int currentCell = 0;
        while (currentCell <= t) {
            currentCell += s[currentCell - 1];
            if (currentCell == t) {
                System.out.println("YES");
                break;
            }
        }
        if (currentCell > t) {
            System.out.println("NO");
        }
    }
}
```
Test case:

Input:
3 2
1 1

Output:
YES</s>
