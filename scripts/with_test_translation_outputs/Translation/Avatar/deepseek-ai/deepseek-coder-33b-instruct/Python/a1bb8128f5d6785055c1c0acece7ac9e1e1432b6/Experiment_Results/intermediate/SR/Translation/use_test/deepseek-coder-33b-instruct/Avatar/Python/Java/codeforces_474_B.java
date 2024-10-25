<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
<|EOT|>
