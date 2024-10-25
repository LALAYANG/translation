<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        String S = scanner.nextLine();
        System.out.println(solve(K, S));
    }

    public static String solve(int K, String S) {
        if (S.length() <= K) {
            return S;
        } else {
            return S.substring(0, K) + "...";
        }
    }
}
```
<|EOT|>
