<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
chokudai
redcoder

Expected output:
No


```
import collections
def run ( s , t ) :
    ss = sorted ( list ( collections.Counter ( s ).values ( ) ) )
    tt = sorted ( list ( collections.Counter ( t ).values ( ) ) )
    if ss == tt :
        return 'Yes'
    else :
        return 'No'
def main ( ) :
    s = input ( )
    t = input ( )
    print ( run ( s , t ) )
if __name__ == '__main__' :
    main ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            sCount.put(c, sCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        List<Integer> ss = new ArrayList<>(sCount.values());
        List<Integer> tt = new ArrayList<>(tCount.values());

        Collections.sort(ss);
        Collections.sort(tt);

        if (ss.equals(tt)) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
```
<|EOT|>
