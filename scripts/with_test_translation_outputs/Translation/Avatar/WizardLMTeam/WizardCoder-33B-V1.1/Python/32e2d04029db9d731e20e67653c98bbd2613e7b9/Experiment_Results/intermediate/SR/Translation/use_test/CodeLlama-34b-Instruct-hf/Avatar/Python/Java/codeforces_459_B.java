<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
5 5 5 5 5

Expected output:
0 10

```
n = int ( input ( ) )
l1 = list ( map ( int , input ( ).split ( ) ) )
l1.sort ( )
a = l1 [ - 1 ]
b = l1 [ 0 ]
if a == b :
    print ( a - b , ( n ) * ( n - 1 ) // 2 )
else :
    ac = l1.count ( a )
    bc = l1.count ( b )
    print ( a - b , ac * bc )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = sc.nextInt();
        }
        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println(a - b + " " + (n * (n - 1)) / 2);
        } else {
            int ac = 0;
            int bc = 0;
            for (int i = 0; i < n; i++) {
                if (l1[i] == a) {
                    ac++;
                } else if (l1[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + ac * bc);
        }
    }
}
```
Test input:
5
5 5 5 5 5

Expected output:
0 10

Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Arrays.sort()` method to sort the input array. The rest of the code is similar to the Python code, with some minor changes to accommodate the differences between Python and Java.</s>
