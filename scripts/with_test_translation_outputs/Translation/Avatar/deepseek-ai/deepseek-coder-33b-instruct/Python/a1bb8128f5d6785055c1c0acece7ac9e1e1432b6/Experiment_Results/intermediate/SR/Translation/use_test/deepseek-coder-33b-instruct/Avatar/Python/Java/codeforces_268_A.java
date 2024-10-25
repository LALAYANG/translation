<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
23
43 78
31 28
58 80
66 63
20 4
51 95
40 20
50 14
5 34
36 39
77 42
64 97
62 89
16 56
8 34
58 16
37 35
37 66
8 54
50 36
24 8
68 48
85 33

Expected output:
6


```
n = int ( input ( ) )
q = [ ]
count = 0
for i in range ( n ) :
    a = input ( ).split ( )
    q.append ( a )
for j in q :
    for k in q :
        if k == j :
            continue
        elif j [ 0 ] == k [ len ( k ) - 1 ] :
            count += 1
        else :
            continue
print ( count )


```

### Response:
```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String[]> q = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }
        for (String[] j : q) {
            for (String[] k : q) {
                if (k == j) {
                    continue;
                } else if (j[0].equals(k[k.length - 1])) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
```
<|EOT|>
