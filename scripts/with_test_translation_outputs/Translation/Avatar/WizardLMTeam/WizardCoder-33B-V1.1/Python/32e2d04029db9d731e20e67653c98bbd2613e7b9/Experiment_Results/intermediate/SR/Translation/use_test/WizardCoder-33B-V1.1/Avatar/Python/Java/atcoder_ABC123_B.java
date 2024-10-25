<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of your Python code:

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
        menu.sort(Comparator.comparingInt(x -> x[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```

Please note that you need to provide the input values when you run the program. The input values should be separated by a space or a newline. For example, if you want to test the program with the provided test case, you should input the numbers as follows:

29
20
7
35
120

Then, the output will be:

215 <｜end▁of▁sentence｜>
