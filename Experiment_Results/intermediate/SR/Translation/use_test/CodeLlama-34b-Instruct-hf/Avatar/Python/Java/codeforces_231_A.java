<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
1 0 0
0 1 1

Expected output:
1


```
n = int ( input ( ) )
c = 0
for i in range ( n ) :
    l1 = list ( map ( int , input ( ).split ( ) ) )
    if sum ( l1 ) > 1 :
        c = c + 1
print ( c )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String[] l1 = sc.nextLine().split(" ");
            int sum = 0;
            for (String s : l1) {
                sum += Integer.parseInt(s);
            }
            if (sum > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer from the user, and the `nextLine()` method is used to read a line of text from the user. The `split()` method is used to split a string into an array of substrings. The `Integer.parseInt()` method is used to convert a string to an integer.</s>
