<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        ArrayList<String> memory = new ArrayList<>();
        for (int x = 0; x < firstLine; x++) {
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
        for (String str : memory) {
            System.out.print(str);
        }
    }
}
```

Please note that in Java, you need to import the necessary classes and handle the input differently. Also, the way to print the output is different in Java. <｜end▁of▁sentence｜>
