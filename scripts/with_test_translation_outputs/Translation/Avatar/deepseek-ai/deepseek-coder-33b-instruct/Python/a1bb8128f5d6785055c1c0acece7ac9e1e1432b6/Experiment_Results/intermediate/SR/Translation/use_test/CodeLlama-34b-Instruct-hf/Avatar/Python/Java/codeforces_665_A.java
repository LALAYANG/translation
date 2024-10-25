<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15 24
23 6
21:15

Expected output:
1


```
a , at = map ( int , input ( ).split ( ) )
b , bt = map ( int , input ( ).split ( ) )
t1 , t2 = map ( int , input ( ).split ( ':' ) )
st = t2 + ( t1 - 5 ) * 60
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140 :
    if now + bt > st :
        ans += 1
    now += b
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int b = sc.nextInt();
        int bt = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the input stream. The `System.out.println()` method is used to print the output to the console.</s>
