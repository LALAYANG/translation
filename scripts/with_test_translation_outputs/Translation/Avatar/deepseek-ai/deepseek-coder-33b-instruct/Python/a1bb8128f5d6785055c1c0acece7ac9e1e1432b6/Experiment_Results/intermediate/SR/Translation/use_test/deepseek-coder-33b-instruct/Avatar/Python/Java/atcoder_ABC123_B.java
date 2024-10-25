<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
29
20
7
35
120

Expected output:
215


```
import math
menu = [ ]
for _ in range ( 5 ) :
    m = input ( )
    e = int ( m [ - 1 ] )
    if e == 0 :
        e = 10
    menu.append ( [ int ( m ) , e ] )
menu.sort ( key = lambda x : x [ 1 ] )
ans = 0
for m in menu [ 1 : ] :
    ans += math.ceil ( m [ 0 ] / 10 ) * 10
print ( ans + menu [ 0 ] [ 0 ] )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.next();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        Collections.sort(menu, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil((double) menu.get(i)[0] / 10) * 10;
        }
        ans += menu.get(0)[0];
        System.out.println(ans);
    }
}
```
<|EOT|>
