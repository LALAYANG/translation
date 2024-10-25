<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9
basic
c
cpp
php
python
nadesico
ocaml
lua
assembly

Expected output:
Yes


```
from collections import defaultdict
n = int ( input ( ) )
s = defaultdict ( lambda : 0 )
l = list ( [ input ( ) for i in range ( n ) ] )
f = 'Yes'
i = - 1
for v in l :
    s [ v ] += 1
    if s [ v ] >= 2 :
        f = 'No'
    if i != - 1 and l [ i ] [ - 1 ] != v [ 0 ] :
        f = 'No'
    i += 1
print ( f )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> s = new HashMap<>();
        List<String> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String v = scanner.nextLine();
            l.add(v);
            s.put(v, s.getOrDefault(v, 0) + 1);
        }
        String f = "Yes";
        int i = -1;
        for (String v : l) {
            if (s.get(v) >= 2) {
                f = "No";
            }
            if (i != -1 && l.get(i).charAt(l.get(i).length() - 1) != v.charAt(0)) {
                f = "No";
            }
            i++;
        }
        System.out.println(f);
    }
}
```
<|EOT|>
