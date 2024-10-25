<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            list.add(word);
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String result = "Yes";
        for (int i = 0; i < list.size(); i++) {
            if (map.get(list.get(i)) > 1) {
                result = "No";
                break;
            }
            if (i > 0 && list.get(i - 1).charAt(list.get(i - 1).length() - 1) != list.get(i).charAt(0)) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` words from the standard input. It stores each word in a list and counts the occurrences of each word in a map. If a word occurs more than once or the last character of a word is not the same as the first character of the next word, it prints "No". Otherwise, it prints "Yes". <｜end▁of▁sentence｜>
