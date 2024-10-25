<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2 2 2 1 1

Expected output:
1
2
1
1
1


```
import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
c = 2
for i in w :
    if i == 1 :
        print ( c )
    elif i % 2 == 0 :
        c = 3 - c
        print ( c )
    else :
        print ( c )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        for (int i = 0; i < n; i++) {
            if (w[i] == 1) {
                System.out.println(c);
            } else if (w[i] % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```
Test input:
5
2 2 2 1 1

Expected output:
1
2
1
1
1</s>
