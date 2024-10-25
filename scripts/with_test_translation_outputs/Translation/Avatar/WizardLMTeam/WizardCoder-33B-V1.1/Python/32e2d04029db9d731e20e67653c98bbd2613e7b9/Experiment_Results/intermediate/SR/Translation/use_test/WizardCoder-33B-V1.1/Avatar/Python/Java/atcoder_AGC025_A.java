<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        List<String> a = Arrays.asList("10", "100", "1000", "10000", "100000");
        int new_ = 0;
        for (char c : n.toCharArray()) {
            new_ += Character.getNumericValue(c);
        }
        if (a.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(new_);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if it is in a predefined list of strings, and if it is, prints 10. If it is not, it calculates the sum of the digits of the string and prints that sum. <｜end▁of▁sentence｜>
