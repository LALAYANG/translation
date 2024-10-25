<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
0 0 1 0 1
0 1 2 2 4

Expected output:
2
4 5


```
n = int ( input ( ) )
t = [ 0 ] + list ( map ( int , input ( ).split ( ) ) )
a = [ 0 ] + list ( map ( int , input ( ).split ( ) ) )
ans , cnt = [ ] , [ 0 for i in range ( n + 1 ) ]
for i in a :
    cnt [ i ] += 1
for i in range ( 1 , n + 1 ) :
    if t [ i ] == 1 :
        crt = [ i ]
        x = a [ i ]
        while cnt [ x ] == 1 :
            crt.append ( x )
            x = a [ x ]
        if len ( crt ) > len ( ans ) :
            ans = crt [ : ]
ans.reverse ( )
print ( len ( ans ) )
print ( ' '.join ( map ( str , ans ) ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] t = new int[n + 1];
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            t[i] = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] cnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cnt[a[i]]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (t[i] == 1) {
                List<Integer> crt = new ArrayList<>();
                crt.add(i);
                int x = a[i];
                while (cnt[x] == 1) {
                    crt.add(x);
                    x = a[x];
                }
                if (crt.size() > ans.size()) {
                    ans = crt;
                }
            }
        }
        System.out.println(ans.size());
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
```
<|EOT|>
