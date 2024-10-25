<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
40
ferelibenterhominesidquodvoluntcredunt

Expected output:
ferelibenterhominesidquodvoluntcredunt


```
def main ( ) :
    K = int ( input ( ) )
    S = input ( )
    if len ( S ) <= K :
        return S
    return S [ : K ] + '...'
if __name__ == '__main__' :
    print ( main ( ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String S = scanner.nextLine();
        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then a string, and then it checks if the length of the string is less than or equal to the integer. If it is, it prints the string. If it isn't, it prints the first K characters of the string followed by "...". <｜end▁of▁sentence｜>
