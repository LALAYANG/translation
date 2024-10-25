<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
0 0 1 0 1
0 1 2 2 4

Expected output:
2
4 5


```
n = int ( input ( ) )
t = [ 0 ] + list ( map ( int , input ( ).split ( ) ) )
a = [ 0 ] + list ( map ( int , input ( ).split ( ) ) )
ans , cnt = [ ] , [ 0 for i in range ( n + 1 ) ]
for i in a :
    cnt [ i ] += 1
for i in range ( 1 , n + 1 ) :
    if t [ i ] == 1 :
        crt = [ i ]
        x = a [ i ]
        while cnt [ x ] == 1 :
            crt.append ( x )
            x = a [ x ]
        if len ( crt ) > len ( ans ) :
            ans = crt [ : ]
ans.reverse ( )
print ( len ( ans ) )
print ( ' '.join ( map ( str , ans ) ) )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        int[] cnt = new int[n + 1];
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                int crt = i;
                int x = a[i];
                while (cnt[x] == 1) {
                    crt = x;
                    x = a[x];
                }
                if (crt > ans[0]) {
                    ans[0] = crt;
                }
            }
        }

        System.out.println(ans[0]);
        for (int i = 1; i <= ans[0]; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a list comprehension to create a list of integers from the input string, while the Java code uses a for loop to iterate over the input string and create an array of integers. Additionally, the Java code uses a Scanner object to read input from the user, while the Python code uses the `input()` function.</s>
