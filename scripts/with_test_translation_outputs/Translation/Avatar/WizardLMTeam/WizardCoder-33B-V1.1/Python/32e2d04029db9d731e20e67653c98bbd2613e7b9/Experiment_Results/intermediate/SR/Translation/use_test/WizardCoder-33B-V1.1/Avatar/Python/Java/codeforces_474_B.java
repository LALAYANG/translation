<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2 7 3 4 9
3
1 25 11

Expected output:
1
5
3


```
L = [ ]
input ( )
r = 1
for k in input ( ).split ( ) :
    L += [ r ] * int ( k )
    r += 1
input ( )
for j in input ( ).split ( ) :
    print ( L [ int ( j ) - 1 ] )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int r = 1;
        for (String k : scanner.nextLine().split(" ")) {
            for (int i = 0; i < Integer.parseInt(k); i++) {
                list.add(r);
            }
            r++;
        }
        scanner.nextLine();
        for (String j : scanner.nextLine().split(" ")) {
            System.out.println(list.get(Integer.parseInt(j) - 1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of space-separated integers, treats each integer as a count of the next number in the sequence, and adds that many instances of the next number to a list. Then it reads another line of space-separated integers, treats each integer as an index into the list (minus 1), and prints the value at that index. <｜end▁of▁sentence｜>
