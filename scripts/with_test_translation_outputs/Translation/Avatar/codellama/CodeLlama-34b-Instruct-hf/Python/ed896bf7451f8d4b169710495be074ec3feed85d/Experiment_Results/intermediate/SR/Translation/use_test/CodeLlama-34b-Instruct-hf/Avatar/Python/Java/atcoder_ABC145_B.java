<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
94
zrimlvumuarenexcfycebfurgvjyospdhvuyfvtvnrdyluazrimlvumuarenexcfycebeurgvjyospdhvuyfvtvnrdylua

Expected output:
No


```
n = int ( input ( ) )
s = input ( )
if n % 2 != 0 : print ( 'No' )
elif s [ : int ( n / 2 ) ] == s [ int ( n / 2 ) : ] : print ( 'Yes' )
else : print ( 'No' )


```
[/INST]
```java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (n % 2 != 0) {
            System.out.println("No");
        } else {
            String firstHalf = s.substring(0, n / 2);
            String secondHalf = s.substring(n / 2);
            if (firstHalf.equals(secondHalf)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```
Note: In Java, the `substring` method is used to extract a substring from a string. The first argument is the starting index of the substring, and the second argument is the ending index (exclusive).</s>
