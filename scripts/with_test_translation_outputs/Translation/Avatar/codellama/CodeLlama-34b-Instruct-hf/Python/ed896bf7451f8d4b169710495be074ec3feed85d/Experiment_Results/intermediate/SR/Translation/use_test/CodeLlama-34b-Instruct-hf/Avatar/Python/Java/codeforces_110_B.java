<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
74

Expected output:
abcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdabcdab


```
LUCKY = "abcd"
n = int ( input ( ) )
s = ""
for i in range ( n ) :
    s += LUCKY [ i % 4 ]
print ( s )


```
[/INST]
```java
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String LUCKY = "abcd";
        String s = "";
        for (int i = 0; i < n; i++) {
            s += LUCKY.charAt(i % 4);
        }
        System.out.println(s);
    }
}
```

Note: In Java, we use the `charAt()` method to access a character in a string by its index. The `%` operator is used to compute the remainder of the division of `i` by 4, which is used to index the `LUCKY` string.</s>
