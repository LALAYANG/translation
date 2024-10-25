<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2

Expected output:
2


```
n = input ( )
a = [ "10" , "100" , "1000" , "10000" , "100000" ]
new = sum ( list ( map ( int , n ) ) )
if n in a :
    print ( 10 )
else :
    print ( new )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] a = {"10", "100", "1000", "10000", "100000"};
        int new_ = 0;
        for (int i = 0; i < n.length(); i++) {
            new_ += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        boolean found = false;
        for (String s : a) {
            if (s.equals(n)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads a string from the user, converts it to an integer, and then checks if it's in the array of strings. If it is, it prints 10. If not, it prints the sum of the digits of the number.
<|EOT|>
