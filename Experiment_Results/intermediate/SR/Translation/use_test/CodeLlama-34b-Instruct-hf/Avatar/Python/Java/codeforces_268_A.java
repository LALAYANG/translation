<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
23
43 78
31 28
58 80
66 63
20 4
51 95
40 20
50 14
5 34
36 39
77 42
64 97
62 89
16 56
8 34
58 16
37 35
37 66
8 54
50 36
24 8
68 48
85 33

Expected output:
6


```
n = int ( input ( ) )
q = [ ]
count = 0
for i in range ( n ) :
    a = input ( ).split ( )
    q.append ( a )
for j in q :
    for k in q :
        if k == j :
            continue
        elif j [ 0 ] == k [ len ( k ) - 1 ] :
            count += 1
        else :
            continue
print ( count )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] q = new String[n][2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            q[i][0] = sc.next();
            q[i][1] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (q[i][0].equals(q[j][1])) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement, i.e., a sequence of pairs of integers separated by a space. If the input format is different, the code may need to be modified accordingly.</s>
