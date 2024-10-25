<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
82
izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn
aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz

Expected output:
148


```
n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] s = scanner.next().toCharArray();
        char[] t = scanner.next().toCharArray();

        if (new String(s).equals(new String(t))) {
            System.out.println(n);
        } else {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (s[i + j] != t[j]) {
                        break;
                    }
                    if (j == n - i - 1) {
                        cnt = n - i;
                    }
                }
            }
            System.out.println(2 * n - cnt);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and two strings `s` and `t` from the standard input, and then checks if `s` and `t` are equal. If they are, it prints `n`. If they are not, it calculates the length of the longest common suffix of `s` and `t`, and then prints `2 * n - cnt`, where `cnt` is the length of the longest common suffix. <｜end▁of▁sentence｜>
