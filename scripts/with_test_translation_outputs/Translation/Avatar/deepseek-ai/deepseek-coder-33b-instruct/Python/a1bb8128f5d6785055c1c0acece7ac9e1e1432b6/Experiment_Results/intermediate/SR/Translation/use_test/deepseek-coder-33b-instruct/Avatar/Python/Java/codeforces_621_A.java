<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15
59 70 48 54 26 67 84 39 40 18 77 69 70 88 93

Expected output:
902

```
n = int ( input ( ) )
lst = list ( map ( int , input ( ).split ( ) ) )
lst.sort ( )
lst.reverse ( )
od = 0
for i in lst :
    if ( i & 1 ) :
        od += 1
sum = 0
ok = 0
for i in range ( n ) :
    if ( lst [ i ] % 2 == 0 ) :
        sum += lst [ i ]
    else :
        if ( ok or od > 1 ) :
            sum += lst [ i ]
            od -= 1
            ok = not ok
print ( sum )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] lst = new Integer[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst, Collections.reverseOrder());
        int od = 0;
        for (int i : lst) {
            if (i % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}
```
<|EOT|>
