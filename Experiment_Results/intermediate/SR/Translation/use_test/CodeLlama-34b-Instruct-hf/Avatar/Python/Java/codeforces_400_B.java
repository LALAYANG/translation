<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4 8
G*S*****
****G*S*
G*****S*
**G***S*

Expected output:
3


```
n , m = map ( int , input ( ).split ( ) )
c = set ( s.find ( "S" ) - s.find ( "G" ) for s in ( input ( ) for _ in range ( n ) ) )
print ( - 1 if any ( a < 0 for a in c ) else len ( c ) )


```
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }

        Set<Integer> c = new HashSet<>();
        for (String s : input) {
            int indexS = s.indexOf("S");
            int indexG = s.indexOf("G");
            if (indexS != -1 && indexG != -1) {
                c.add(indexS - indexG);
            }
        }

        if (c.contains(-1)) {
            System.out.println(-1);
        } else {
            System.out.println(c.size());
        }
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement, i.e., the first line contains two integers n and m, and the next n lines contain the strings. The code also assumes that the strings are non-empty and contain only the characters 'G' and 'S'. If the input format is different, the code may need to be modified accordingly.</s>
