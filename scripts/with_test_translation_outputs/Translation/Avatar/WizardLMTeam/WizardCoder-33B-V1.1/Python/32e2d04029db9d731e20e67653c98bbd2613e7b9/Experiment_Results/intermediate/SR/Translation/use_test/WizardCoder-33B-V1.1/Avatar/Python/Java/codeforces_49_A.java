<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] vo = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == ' ' || a.charAt(i) == '?') {
                continue;
            } else {
                boolean found = false;
                for (char c : vo) {
                    if (a.charAt(i) == c) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then checks the last character of the string. If the character is a vowel, it prints "YES". If the character is not a vowel, it prints "NO". If the character is a space or a question mark, it skips that character and checks the next one. The loop continues until it finds a non-space, non-question mark character. <｜end▁of▁sentence｜>
