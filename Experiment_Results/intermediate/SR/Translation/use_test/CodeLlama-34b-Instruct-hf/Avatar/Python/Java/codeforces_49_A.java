<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
dJcNqQiFXzcbsj fItCpBLyXOnrSBPebwyFHlxUJHqCUzzCmcAvMiKL NunwOXnKeIxUZmBVwiCUfPkjRAkTPbkYCmwRRnDSLaz?

Expected output:
NO


```
a = input ( )
vo = [ 'a' , 'e' , 'i' , 'o' , 'u' , 'y' , 'A' , 'E' , 'I' , 'O' , 'U' , 'Y' ]
for i in range ( len ( a ) - 1 , - 1 , - 1 ) :
    if ( a [ i ] == ' ' or a [ i ] == '?' ) :
        continue
    else :
        if ( a [ i ] in vo ) :
            print ( "YES" )
        else :
            print ( "NO" )
        break


```
[/INST]
```java
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String vowels = "aeiouyAEIOUY";
        boolean hasVowel = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '?') {
                continue;
            } else {
                if (vowels.contains(input.charAt(i))) {
                    hasVowel = true;
                    break;
                }
            }
        }

        if (hasVowel) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
Note: In Java, we use the `contains()` method to check if a string contains a particular character. We also use the `break` statement to exit the loop early if we find a vowel.</s>
