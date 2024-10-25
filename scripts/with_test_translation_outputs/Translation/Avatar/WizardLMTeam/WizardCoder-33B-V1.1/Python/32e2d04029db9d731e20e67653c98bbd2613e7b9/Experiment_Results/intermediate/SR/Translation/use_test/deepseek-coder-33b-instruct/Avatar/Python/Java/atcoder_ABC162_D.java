<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
BBBBBBBBBB

Expected output:
0


```
import math
N = int ( input ( ) )
S = input ( )
def calculate ( n , s ) :
    arr = list ( s )
    rNum = arr.count ( "R" )
    gNum = arr.count ( "G" )
    bNum = arr.count ( "B" )
    sum = 0
    for step in range ( 1 , math.ceil ( n / 2 ) + 1 ) :
        for i in range ( n - 2 * step ) :
            s = "".join ( [ arr [ i ] , arr [ i + step ] , arr [ i + step * 2 ] ] )
            if s == "RGB" or s == "RBG" or s == "BGR" or s == "BRG" or s == "GBR" or s == "GRB" :
                sum = sum + 1
    print ( rNum * gNum * bNum - sum )
calculate ( N , S )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        calculate(N, S);
    }

    public static void calculate(int n, String s) {
        char[] arr = s.toCharArray();
        int rNum = 0, gNum = 0, bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            else if (c == 'G') gNum++;
            else if (c == 'B') bNum++;
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String str = "" + arr[i] + arr[i + step] + arr[i + 2 * step];
                if (str.equals("RGB") || str.equals("RBG") || str.equals("BGR") || str.equals("BRG") || str.equals("GBR") || str.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
```
<|EOT|>
