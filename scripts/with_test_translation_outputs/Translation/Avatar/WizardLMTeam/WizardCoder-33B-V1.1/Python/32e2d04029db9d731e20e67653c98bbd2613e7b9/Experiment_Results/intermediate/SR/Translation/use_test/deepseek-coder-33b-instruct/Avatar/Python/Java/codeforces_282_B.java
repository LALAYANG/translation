<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3
400 600
400 600
400 600

Expected output:
AGA


```
firstline = int ( input ( ) )
total = 0
memory = [ ]
for x in range ( firstline ) :
    A , G = list ( map ( int , input ( ).split ( ) ) )
    if total + A <= 500 :
        total += A
        memory.append ( "A" )
    else :
        total -= G
        memory.append ( "G" )
print ( "".join ( memory ) )


```

### Response:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        List<String> memory = new ArrayList<>();
        for (int i = 0; i < firstLine; i++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.add("A");
            } else {
                total -= G;
                memory.add("G");
            }
        }
        for (String s : memory) {
            System.out.print(s);
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads the first line of input, which is the number of iterations. Then it reads two integers A and G for each iteration. If the sum of A and the current total is less than or equal to 500, it adds A to the total and adds "A" to the memory list. Otherwise, it subtracts G from the total and adds "G" to the memory list. Finally, it prints out the contents of the memory list.
<|EOT|>
